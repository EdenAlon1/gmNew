package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dogx implements dnmx {
    public final dmzz a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;
    public final dogf f;
    public final dogf g;
    public final ffix h;
    private final dlti i;

    public /* synthetic */ dogx(dmzz dmzzVar, String str, String str2, String str3, List list, dogf dogfVar, dogf dogfVar2, ffix ffixVar) {
        dmzzVar.getClass();
        this.a = dmzzVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = list;
        this.f = dogfVar;
        this.g = dogfVar2;
        this.i = null;
        this.h = ffixVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dogx)) {
            return false;
        }
        dogx dogxVar = (dogx) obj;
        if (this.a != dogxVar.a || !ffkj.e(this.b, dogxVar.b) || !ffkj.e(this.c, dogxVar.c) || !ffkj.e(this.d, dogxVar.d) || !ffkj.e(this.e, dogxVar.e) || !ffkj.e(this.f, dogxVar.f) || !ffkj.e(this.g, dogxVar.g)) {
            return false;
        }
        dlti dltiVar = dogxVar.i;
        return ffkj.e(null, null) && ffkj.e(this.h, dogxVar.h);
    }

    public final int hashCode() {
        return (((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 961) + this.h.hashCode();
    }

    public final String toString() {
        return "AlertCardUiData(featureIcon=" + this.a + ", featureTitle=" + this.b + ", cardTitle=" + this.c + ", cardDescription=" + this.d + ", cardDescriptionAnnotations=" + this.e + ", primaryButton=" + this.f + ", secondaryButton=" + this.g + ", initialCompositionElement=null, onCloseClick=" + this.h + ")";
    }
}
