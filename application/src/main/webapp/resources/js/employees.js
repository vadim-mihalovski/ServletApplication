$(document).ready(function () {


    $('.js-action-reset-salary').on('click', function () {
        var self = $(this);
        var keyValue = self.attr('data-employee-key');
        $.ajax(location.href, {
            method: 'post',
            data: {key: keyValue},
            success: function (result) {
                var newData = JSON.parse(result);
                Object.keys(newData).forEach(function (key) {
                    var value = newData[key];
                    // jquery selectors
                    self.closest('tr').children('td[data-name=' + key + ']').text(value);
                });
            }
        });
    });

    $('#employees').DataTable();
});