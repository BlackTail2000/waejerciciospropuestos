document.addEventListener("DOMContentLoaded", function() {
    const tooltips = document.querySelectorAll(".tt");
    tooltips.forEach(tooltipElement => {
        new bootstrap.Tooltip(tooltipElement, {
            html: true
        });
    });
});
