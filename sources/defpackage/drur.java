package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drur implements drun {
    public final ffsk a;
    public final ea b;
    public final drwd c;
    public final aepl d;
    private final druy e;

    public drur(ffsk ffskVar, druy druyVar, ea eaVar, drwd drwdVar, aepl aeplVar) {
        ffskVar.getClass();
        this.a = ffskVar;
        this.e = druyVar;
        this.b = eaVar;
        this.c = drwdVar;
        this.d = aeplVar;
    }

    public static final drva b(drnm drnmVar) {
        drlw m = drnmVar.m();
        if (m instanceof drlu) {
            return drva.MEDIA_TYPE_IMAGE;
        }
        if (m instanceof drlv) {
            return drva.MEDIA_TYPE_VIDEO;
        }
        drlw m2 = drnmVar.m();
        Objects.toString(m2);
        throw new IllegalStateException("Invalid non-visual media type ".concat(m2.toString()));
    }

    @Override // defpackage.drun
    public final Object a(doxj doxjVar, drnm drnmVar, ffgu ffguVar) {
        return this.e.b(doxjVar, new druo(this), new drup(this, drnmVar, null), ffguVar);
    }
}
