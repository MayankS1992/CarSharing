package entities;

import lombok.Data;

import java.util.Optional;

public class LoginResult {
    private Optional<String> result;
    private Optional<String> page;

    public Optional<String> getResult() {
        return result;
    }

    public void setResult(Optional<String> result) {
        this.result = result;
    }

    public Optional<String> getPage() {
        return page;
    }

    public void setPage(Optional<String> page) {
        this.page = page;
    }
}
