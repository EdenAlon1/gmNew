package defpackage;

import com.google.android.ims.message.rbm.RbmSpecificMessage;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apoq implements appr {
    public final apop a;
    private final appw b;
    private final appw c;
    private final List d;

    public apoq(appw appwVar, appw appwVar2, apop apopVar, List list) {
        list.getClass();
        this.b = appwVar;
        this.c = appwVar2;
        this.a = apopVar;
        this.d = list;
        if (appwVar == null && appwVar2 == null && apopVar == null) {
            throw new IllegalStateException("One of title, description, or attachment must be provided.");
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
        return this.c;
    }

    @Override // defpackage.appr
    public final appw d() {
        return this.b;
    }

    @Override // defpackage.appr
    public final List e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof apoq)) {
            return false;
        }
        apoq apoqVar = (apoq) obj;
        return ffkj.e(this.b, apoqVar.b) && ffkj.e(this.c, apoqVar.c) && ffkj.e(this.a, apoqVar.a) && ffkj.e(this.d, apoqVar.d);
    }

    public final int hashCode() {
        appw appwVar = this.b;
        int hashCode = appwVar == null ? 0 : appwVar.hashCode();
        appw appwVar2 = this.c;
        int hashCode2 = appwVar2 == null ? 0 : appwVar2.hashCode();
        int i = hashCode * 31;
        apop apopVar = this.a;
        return ((((i + hashCode2) * 31) + (apopVar != null ? apopVar.hashCode() : 0)) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "BugleVerticalRichCardContent(title=" + this.b + ", description=" + this.c + ", attachment=" + this.a + ", suggestions=" + this.d + ")";
    }
}
