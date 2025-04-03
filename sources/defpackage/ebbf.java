package defpackage;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebbf extends ebba {
    public Context b;
    public ebbc c;
    public eave d;
    public ebas e;
    public ebga f;
    public ebtw g;
    public ebfw h;
    public final emxc i;
    public eawd j;
    public eawd k;
    public ExecutorService l;
    public dwch m;
    public ebvw n;
    public ebun o;
    public final emxc p;
    public final emxc q;

    public ebbf() {
        emux emuxVar = emux.a;
        this.i = emuxVar;
        this.p = emuxVar;
        this.q = emuxVar;
    }

    @Override // defpackage.ebba
    public final Context a() {
        Context context = this.b;
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Property \"applicationContext\" has not been set");
    }

    @Override // defpackage.ebba
    public final eave b() {
        eave eaveVar = this.d;
        if (eaveVar != null) {
            return eaveVar;
        }
        throw new IllegalStateException("Property \"accountConverter\" has not been set");
    }

    @Override // defpackage.ebba
    public final ebbc c() {
        ebbc ebbcVar = this.c;
        if (ebbcVar != null) {
            return ebbcVar;
        }
        throw new IllegalStateException("Property \"accountsModel\" has not been set");
    }

    @Override // defpackage.ebba
    public final ebga d() {
        ebga ebgaVar = this.f;
        if (ebgaVar != null) {
            return ebgaVar;
        }
        throw new IllegalStateException("Property \"features\" has not been set");
    }

    @Override // defpackage.ebba
    public final emxc e() {
        eawd eawdVar = this.j;
        return eawdVar == null ? emux.a : emxc.j(eawdVar);
    }

    @Override // defpackage.ebba
    public final void f() {
        if (this.h == null) {
            throw new IllegalStateException("Property \"configuration\" has not been set");
        }
    }
}
