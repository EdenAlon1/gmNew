package androidx.compose.foundation.text.modifiers;

import defpackage.fbe;
import defpackage.fbo;
import defpackage.ffji;
import defpackage.ffkj;
import defpackage.hvh;
import defpackage.ibz;
import defpackage.ivp;
import defpackage.jlm;
import defpackage.jpo;
import defpackage.jse;
import defpackage.jyw;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class TextAnnotatedStringElement extends ivp<fbo> {
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
    private final fbe l = null;
    private final ibz m;
    private final ffji n;

    public TextAnnotatedStringElement(jlm jlmVar, jpo jpoVar, jse jseVar, ffji ffjiVar, int i, boolean z, int i2, int i3, List list, ffji ffjiVar2, ibz ibzVar, ffji ffjiVar3) {
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
        this.m = ibzVar;
        this.n = ffjiVar3;
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ hvh d() {
        return new fbo(this.a, this.b, this.c, this.d, this.f, this.g, this.h, this.i, this.j, this.k, null, this.m, this.n);
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ void e(hvh hvhVar) {
        fbo fboVar = (fbo) hvhVar;
        fboVar.j(fboVar.n(this.m, this.b), fboVar.o(this.a), fboVar.v(this.b, this.j, this.i, this.h, this.g, this.c, this.f), fboVar.l(this.d, this.k, null, this.n));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextAnnotatedStringElement)) {
            return false;
        }
        TextAnnotatedStringElement textAnnotatedStringElement = (TextAnnotatedStringElement) obj;
        if (!ffkj.e(this.m, textAnnotatedStringElement.m) || !ffkj.e(this.a, textAnnotatedStringElement.a) || !ffkj.e(this.b, textAnnotatedStringElement.b) || !ffkj.e(this.j, textAnnotatedStringElement.j) || !ffkj.e(this.c, textAnnotatedStringElement.c) || this.d != textAnnotatedStringElement.d || this.n != textAnnotatedStringElement.n || !jyw.a(this.f, textAnnotatedStringElement.f) || this.g != textAnnotatedStringElement.g || this.h != textAnnotatedStringElement.h || this.i != textAnnotatedStringElement.i || this.k != textAnnotatedStringElement.k) {
            return false;
        }
        fbe fbeVar = textAnnotatedStringElement.l;
        return ffkj.e(null, null);
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        ffji ffjiVar = this.d;
        int hashCode2 = ((((((((((hashCode * 31) + (ffjiVar != null ? ffjiVar.hashCode() : 0)) * 31) + this.f) * 31) + (true != this.g ? 1237 : 1231)) * 31) + this.h) * 31) + this.i) * 31;
        List list = this.j;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        ffji ffjiVar2 = this.k;
        int hashCode4 = hashCode3 + (ffjiVar2 != null ? ffjiVar2.hashCode() : 0);
        ibz ibzVar = this.m;
        int hashCode5 = ((hashCode4 * 961) + (ibzVar != null ? ibzVar.hashCode() : 0)) * 31;
        ffji ffjiVar3 = this.n;
        return hashCode5 + (ffjiVar3 != null ? ffjiVar3.hashCode() : 0);
    }
}
