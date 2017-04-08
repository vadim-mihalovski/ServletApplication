$(document).ready(function () {
    $('#employees').DataTable();

    $('.js-action-reset-salary').on('click', function () {
        var self = $(this);
        var keyValue = self.attr('data-employee-key');
        $.ajax(location.href, {
            method: 'post',
            data: {key: keyValue},
            success: function (result) {
                self.closest('td').prev().text(result);
            }
        });
    });
});