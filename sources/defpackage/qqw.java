package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qqw {
    public final qqx a;
    public final boolean[] b;
    public boolean c;
    public final /* synthetic */ qqz d;

    public qqw(qqz qqzVar, qqx qqxVar) {
        this.d = qqzVar;
        this.a = qqxVar;
        this.b = qqxVar.e ? null : new boolean[qqzVar.d];
    }

    public final void a() {
        this.d.b(this, false);
    }

    public final void b() {
        if (this.c) {
            return;
        }
        try {
            a();
        } catch (IOException unused) {
        }
    }
}
