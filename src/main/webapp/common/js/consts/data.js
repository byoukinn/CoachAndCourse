var regex = {
    illegal: new RegExp("[\\w!#$%&'*+/=?^_`{|}~-]*([!#$%&'*+/=?^_`{|}~-])[\\w!#$%&'*+/=?^_`{|}~-]*"),
    email: new RegExp("[\\w!#$%&'*+/=?^_`{|}~-]+" +
        "(?:\\.[\\w!#$%&'*+/=?^_`{|}~-]+)*@" +
        "(?:[\\w](?:[\\w-]*[\\w])?\\.)+[\\w]" +
        "(?:[\\w-]*[\\w])?"),
}