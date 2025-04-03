package defpackage;

import android.net.Uri;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aijl implements aihs {
    public final Uri a;
    public final aoku b;
    public final List c;
    public final int d;

    public aijl(Uri uri, aoku aokuVar, int i, List list) {
        list.getClass();
        this.a = uri;
        this.b = aokuVar;
        this.d = i;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aijl)) {
            return false;
        }
        aijl aijlVar = (aijl) obj;
        return ffkj.e(this.a, aijlVar.a) && ffkj.e(this.b, aijlVar.b) && this.d == aijlVar.d && ffkj.e(this.c, aijlVar.c);
    }

    public final int hashCode() {
        Uri uri = this.a;
        int hashCode = uri == null ? 0 : uri.hashCode();
        aoku aokuVar = this.b;
        return (((((hashCode * 31) + (aokuVar != null ? aokuVar.hashCode() : 0)) * 31) + this.d) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "ContactEditor(contactUri=" + this.a + ", identity=" + this.b + ", source=" + ((Object) Integer.toString(this.d - 1)) + ", contentValues=" + this.c + ")";
    }
}
