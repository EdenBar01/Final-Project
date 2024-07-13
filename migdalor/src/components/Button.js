import React from 'react';
import PropTypes from 'prop-types';

// Define the Button component
const Button = ({
  label,
  onClick,
  disabled = false,
  type = 'button',
  className = '',
  icon: Icon = null,
}) => 
{
  return (
    <button
      type={type}
      onClick={onClick}
      disabled={disabled}
      className={`
      flex gap-[10px] justify-end items-center shrink-0 flex-nowrap 
      bg-[#585858] border-none relative pointer`}
    >
      {Icon && <Icon className="btn-icon" />}
      {label}
    </button>
  );
};

// Define prop types for the Button component
// Button.propTypes = {
//   label: PropTypes.string.isRequired,
//   onClick: PropTypes.func.isRequired,
//   disabled: PropTypes.bool,
//   type: PropTypes.oneOf(['button', 'submit', 'reset']),
//   className: PropTypes.string,
//   icon: PropTypes.elementType,
// };

export default Button;
