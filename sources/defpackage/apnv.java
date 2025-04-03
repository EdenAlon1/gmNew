package defpackage;

import com.android.vcard.VCardConstants;
import com.google.android.ims.message.rbm.RbmSpecificMessage;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apnv implements appr {
    public final apnu a;
    public final int b;
    private final appw c;
    private final appw d;
    private final List e;

    public apnv(appw appwVar, appw appwVar2, apnu apnuVar, List list, int i) {
        list.getClass();
        this.c = appwVar;
        this.d = appwVar2;
        this.a = apnuVar;
        this.e = list;
        this.b = i;
        if (appwVar == null && appwVar2 == null && apnuVar == null) {
            throw new IllegalStateException("One of title, description, or attachment must be provided.");
        }
        if (apnuVar != null && appwVar == null && appwVar2 == null && list.isEmpty()) {
            throw new IllegalStateException("Horizontal rich card cannot only have an attachment.");
        }
    }

    @Override // defpackage.appr
    public final /* synthetic */ apos a() {
        return this.a;
    }

    @Override // defpackage.appj
    public final String b() {
        return RbmSpecificMessage.CONTENT_TYPE;
    }

    @Override // defpackage.appr
    public final appw c() {
        return this.d;
    }

    @Override // defpackage.appr
    public final appw d() {
        return this.c;
    }

    @Override // defpackage.appr
    public final List e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof apnv)) {
            return false;
        }
        apnv apnvVar = (apnv) obj;
        return ffkj.e(this.c, apnvVar.c) && ffkj.e(this.d, apnvVar.d) && ffkj.e(this.a, apnvVar.a) && ffkj.e(this.e, apnvVar.e) && this.b == apnvVar.b;
    }

    public final int hashCode() {
        appw appwVar = this.c;
        int hashCode = appwVar == null ? 0 : appwVar.hashCode();
        appw appwVar2 = this.d;
        int hashCode2 = appwVar2 == null ? 0 : appwVar2.hashCode();
        int i = hashCode * 31;
        apnu apnuVar = this.a;
        return ((((((i + hashCode2) * 31) + (apnuVar != null ? apnuVar.hashCode() : 0)) * 31) + this.e.hashCode()) * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BugleHorizontalRichCardContent(title=");
        sb.append(this.c);
        sb.append(", description=");
        sb.append(this.d);
        sb.append(", attachment=");
        sb.append(this.a);
        sb.append(", suggestions=");
        sb.append(this.e);
        sb.append(", alignment=");
        sb.append((Object) (this.b != 1 ? VCardConstants.PROPERTY_END : "START"));
        sb.append(")");
        return sb.toString();
    }
}
