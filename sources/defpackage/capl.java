package defpackage;

import com.google.android.apps.messaging.shared.datamodel.etouffee.info.E2eeInfo;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class capl {
    public final E2eeInfo a;
    public final Map b;
    public final aqux c;

    public capl(E2eeInfo e2eeInfo, Map map, aqux aquxVar) {
        e2eeInfo.getClass();
        this.a = e2eeInfo;
        this.b = map;
        this.c = aquxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof capl)) {
            return false;
        }
        capl caplVar = (capl) obj;
        return ffkj.e(this.a, caplVar.a) && ffkj.e(this.b, caplVar.b) && ffkj.e(this.c, caplVar.c);
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        aqux aquxVar = this.c;
        return (hashCode * 31) + (aquxVar == null ? 0 : aquxVar.hashCode());
    }

    public final String toString() {
        return "DetailsPageE2eeInfoResult(selfE2eeInfo=" + this.a + ", e2eeInfoMap=" + this.b + ", selfIdentity=" + this.c + ")";
    }
}
