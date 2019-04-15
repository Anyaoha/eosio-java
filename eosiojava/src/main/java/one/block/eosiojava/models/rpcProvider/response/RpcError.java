package one.block.eosiojava.models.rpcProvider.response;

import com.google.gson.annotations.SerializedName;
import java.math.BigInteger;
import java.util.List;

/**
 * The Error of RPC response error
 */
public class RpcError {

    /**
     * The Code.
     */
    @SerializedName("code")
    private BigInteger code;

    /**
     * The Name.
     */
    @SerializedName("name")
    private String name;

    /**
     * The What.
     */
    @SerializedName("what")
    private String what;

    /**
     * The Details.
     */
    @SerializedName("details")
    private List<Detail> details;

    /**
     * Gets code.
     *
     * @return the code
     */
    public BigInteger getCode() {
        return code;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets what.
     *
     * @return the what
     */
    public String getWhat() {
        return what;
    }

    /**
     * Gets details.
     *
     * @return the details
     */
    public List<Detail> getDetails() {
        return details;
    }
}