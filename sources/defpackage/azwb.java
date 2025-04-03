package defpackage;

import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azwb extends lov implements bcqe {
    private static final cskc j = cskc.g("BugleDataModel", "BoundTypedCursorLoader");
    private final String k;
    private final ksz l;
    private final Uri m;
    private final elbx n;
    private final ekyo o;
    private final ContentObserver p;
    private dtsu q;

    public azwb(elbx elbxVar, ekyo ekyoVar, String str, Context context, Uri uri, ksz kszVar) {
        super(context);
        j.q("onCreate: ".concat(String.valueOf(String.valueOf(uri))));
        this.k = str;
        this.l = kszVar;
        this.m = uri;
        this.n = elbxVar;
        this.o = ekyoVar;
        this.p = new low(this);
    }

    @Override // defpackage.lov
    protected final /* bridge */ /* synthetic */ Object b() {
        ekzm b = this.n.b("BoundTypedCursorLoader#onLoadInBackground");
        try {
            dtsu a = a();
            b.close();
            return a;
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.lov
    public final /* bridge */ /* synthetic */ void e(Object obj) {
        dtsu dtsuVar = (dtsu) obj;
        if (dtsuVar == null || dtsuVar.isClosed()) {
            return;
        }
        dtsuVar.close();
    }

    @Override // defpackage.lox
    public final void l() {
        h();
        dtsu dtsuVar = this.q;
        if (dtsuVar != null && !dtsuVar.isClosed()) {
            this.q.close();
        }
        this.q = null;
    }

    @Override // defpackage.lox
    protected final void m() {
        dtsu dtsuVar = this.q;
        if (dtsuVar != null) {
            j(dtsuVar);
        }
        if (q() || this.q == null) {
            f();
        }
    }

    @Override // defpackage.lox
    protected final void n() {
        h();
    }

    @Override // defpackage.lov
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final dtsu a() {
        try {
            dtyq dtyqVar = (dtyq) this.l.a();
            dtsu o = dtyqVar.o();
            o.a().setNotificationUri(this.c.getContentResolver(), this.m);
            o.a().registerContentObserver(this.p);
            csjb a = j.a();
            a.I("Load query in background:");
            a.I(dtyqVar);
            a.r();
            return o;
        } catch (SecurityException e) {
            csjb b = j.b();
            b.I("Failed to load cursor for");
            b.I(this.m);
            b.s(e);
            return null;
        }
    }

    @Override // defpackage.bcqe
    public final String t() {
        return this.k;
    }

    @Override // defpackage.lox
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public final void j(dtsu dtsuVar) {
        elav a = this.o.a("BoundTypedCursorLoader#deliverResult");
        try {
            if (this.f) {
                j.p("Loader is reset, not delivering result");
                if (dtsuVar != null) {
                    dtsuVar.close();
                }
            } else {
                dtsu dtsuVar2 = this.q;
                this.q = dtsuVar;
                if (this.d) {
                    super.j(this.q);
                } else {
                    j.p("Loader is not started, not delivering result");
                }
                if (dtsuVar2 != null && dtsuVar2 != dtsuVar && !dtsuVar2.isClosed()) {
                    dtsuVar2.close();
                }
            }
            a.close();
        } catch (Throwable th) {
            try {
                a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
