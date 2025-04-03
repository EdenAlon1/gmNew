package androidx.compose.foundation.text.modifiers;

import defpackage.evu;
import defpackage.fba;
import defpackage.fbe;
import defpackage.fbo;
import defpackage.ffji;
import defpackage.ffkj;
import defpackage.hvh;
import defpackage.ibz;
import defpackage.itz;
import defpackage.ivp;
import defpackage.jlm;
import defpackage.jpo;
import defpackage.jse;
import defpackage.jyw;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class SelectableTextAnnotatedStringElement extends ivp<fba> {
    private final jlm a;
    private final jpo b;
    private final jse c;
    private final ffji d;
    private final int f;
    private final boolean g;
    private final int h;
    private final int i;
    private final List j;
    private final ffji k;
    private final fbe l;
    private final ibz m;
    private final evu n = null;

    public SelectableTextAnnotatedStringElement(jlm jlmVar, jpo jpoVar, jse jseVar, ffji ffjiVar, int i, boolean z, int i2, int i3, List list, ffji ffjiVar2, fbe fbeVar, ibz ibzVar) {
        this.a = jlmVar;
        this.b = jpoVar;
        this.c = jseVar;
        this.d = ffjiVar;
        this.f = i;
        this.g = z;
        this.h = i2;
        this.i = i3;
        this.j = list;
        this.k = ffjiVar2;
        this.l = fbeVar;
        this.m = ibzVar;
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ hvh d() {
        return new fba(this.a, this.b, this.c, this.d, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m);
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ void e(hvh hvhVar) {
        fba fbaVar = (fba) hvhVar;
        fbo fboVar = fbaVar.b;
        ibz ibzVar = this.m;
        jpo jpoVar = this.b;
        ffji ffjiVar = this.d;
        ffji ffjiVar2 = this.k;
        fbe fbeVar = this.l;
        fboVar.j(fboVar.n(ibzVar, jpoVar), fboVar.o(this.a), fboVar.v(jpoVar, this.j, this.i, this.h, this.g, this.c, this.f), fboVar.l(ffjiVar, ffjiVar2, fbeVar, null));
        fbaVar.a = fbeVar;
        itz.b(fbaVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectableTextAnnotatedStringElement)) {
            return false;
        }
        SelectableTextAnnotatedStringElement selectableTextAnnotatedStringElement = (SelectableTextAnnotatedStringElement) obj;
        if (!ffkj.e(this.m, selectableTextAnnotatedStringElement.m) || !ffkj.e(this.a, selectableTextAnnotatedStringElement.a) || !ffkj.e(this.b, selectableTextAnnotatedStringElement.b) || !ffkj.e(this.j, selectableTextAnnotatedStringElement.j) || !ffkj.e(this.c, selectableTextAnnotatedStringElement.c)) {
            return false;
        }
        evu evuVar = selectableTextAnnotatedStringElement.n;
        return ffkj.e(null, null) && this.d == selectableTextAnnotatedStringElement.d && jyw.a(this.f, selectableTextAnnotatedStringElement.f) && this.g == selectableTextAnnotatedStringElement.g && this.h == selectableTextAnnotatedStringElement.h && this.i == selectableTextAnnotatedStringElement.i && this.k == selectableTextAnnotatedStringElement.k && ffkj.e(this.l, selectableTextAnnotatedStringElement.l);
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        ffji ffjiVar = this.d;
        int hashCode2 = ((((((((((hashCode * 31) + (ffjiVar != null ? ffjiVar.hashCode() : 0)) * 31) + this.f) * 31) + (true != this.g ? 1237 : 1231)) * 31) + this.h) * 31) + this.i) * 31;
        List list = this.j;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        ffji ffjiVar2 = this.k;
        int hashCode4 = ((hashCode3 + (ffjiVar2 != null ? ffjiVar2.hashCode() : 0)) * 31) + this.l.hashCode();
        ibz ibzVar = this.m;
        return (hashCode4 * 961) + (ibzVar != null ? ibzVar.hashCode() : 0);
    }
}
