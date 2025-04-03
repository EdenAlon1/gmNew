package defpackage;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class dfux {
    public final DataHolder a;
    protected final int b;
    private final int c;

    public dfux(DataHolder dataHolder, int i) {
        dfwv.n(dataHolder);
        this.a = dataHolder;
        boolean z = false;
        if (i >= 0 && i < dataHolder.i) {
            z = true;
        }
        dfwv.i(z);
        this.b = i;
        this.c = dataHolder.a(i);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dfux) {
            dfux dfuxVar = (dfux) obj;
            if (dfwq.a(Integer.valueOf(dfuxVar.b), Integer.valueOf(this.b)) && dfwq.a(Integer.valueOf(dfuxVar.c), Integer.valueOf(this.c)) && dfuxVar.a == this.a) {
                return true;
            }
        }
        return false;
    }

    public final int gM(String str) {
        int i = this.b;
        DataHolder dataHolder = this.a;
        dataHolder.c(str, i);
        return dataHolder.e[this.c].getInt(i, dataHolder.d.getInt(str));
    }

    protected final String gN(String str) {
        return this.a.b(str, this.b, this.c);
    }

    public final byte[] gO() {
        DataHolder dataHolder = this.a;
        int i = this.b;
        dataHolder.c(GroupManagementRequest.DATA_TAG, i);
        return dataHolder.e[this.c].getBlob(i, dataHolder.d.getInt(GroupManagementRequest.DATA_TAG));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.c), this.a});
    }
}
