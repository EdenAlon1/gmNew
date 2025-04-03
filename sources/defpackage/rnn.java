package defpackage;

import android.graphics.Path;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rnn extends rnq {
    public float a;
    public final float b;
    public final Path c;
    final /* synthetic */ rns d;

    public rnn(rns rnsVar, float f, float f2, Path path) {
        this.d = rnsVar;
        this.a = f;
        this.b = f2;
        this.c = path;
    }

    @Override // defpackage.rnq
    public final void a(String str) {
        String str2;
        if (this.d.i()) {
            Path path = new Path();
            str2 = str;
            this.d.d.d.getTextPath(str2, 0, str.length(), this.a, this.b, path);
            this.c.addPath(path);
        } else {
            str2 = str;
        }
        this.a += this.d.d.d.measureText(str2);
    }

    @Override // defpackage.rnq
    public final boolean b(rna rnaVar) {
        if (!(rnaVar instanceof rnb)) {
            return true;
        }
        rns.h("Using <textPath> elements in a clip path is not supported.", new Object[0]);
        return false;
    }
}
