package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class chyf implements ciin {
    private final String b;
    private final ffbr d;
    private final ArrayList c = new ArrayList();
    public String a = "";
    private long e = 0;

    public chyf(ffbr ffbrVar, String str, Iterable iterable) {
        this.b = str;
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            ArrayList arrayList = this.c;
            fcej fcejVar = (fcej) fcek.a.createBuilder();
            fcejVar.copyOnWrite();
            fcek fcekVar = (fcek) fcejVar.instance;
            str2.getClass();
            fcekVar.c = str2;
            fgtg fgtgVar = fgtg.PHONE_NUMBER;
            fcejVar.copyOnWrite();
            ((fcek) fcejVar.instance).b = fgtgVar.a();
            arrayList.add((fcek) fcejVar.build());
        }
        this.d = ffbrVar;
    }

    @Override // defpackage.ciin
    public final long a() {
        return this.e;
    }

    @Override // defpackage.ciin
    public final ciil b() {
        return new ciii(this.b);
    }

    @Override // defpackage.ciin
    public final ListenableFuture c(fcfo fcfoVar) {
        fcac fcacVar = (fcac) fcad.a.createBuilder();
        fcacVar.copyOnWrite();
        fcad fcadVar = (fcad) fcacVar.instance;
        fcfoVar.getClass();
        fcadVar.c = fcfoVar;
        fcadVar.b |= 1;
        fcacVar.a(this.c);
        fbyn fbynVar = (fbyn) fbyo.a.createBuilder();
        fbynVar.copyOnWrite();
        ((fbyo) fbynVar.instance).b = 2;
        fcacVar.copyOnWrite();
        fcad fcadVar2 = (fcad) fcacVar.instance;
        fbyo fbyoVar = (fbyo) fbynVar.build();
        fbyoVar.getClass();
        fcadVar2.f = fbyoVar;
        fcadVar2.b |= 4;
        this.a = fcfoVar.c;
        return erqt.i((fcad) fcacVar.build());
    }

    @Override // defpackage.ciin
    public final /* bridge */ /* synthetic */ ListenableFuture d(chrv chrvVar, eyhs eyhsVar) {
        return chrvVar.d(cpta.b(((avkc) this.d.b()).c(this.b))).d((fcad) eyhsVar);
    }

    @Override // defpackage.ciin
    public final /* bridge */ /* synthetic */ ListenableFuture e(eyhs eyhsVar) {
        long j;
        fcaf fcafVar = (fcaf) eyhsVar;
        if (fcafVar != null) {
            fcfq fcfqVar = fcafVar.b;
            if (fcfqVar == null) {
                fcfqVar = fcfq.a;
            }
            j = fcfqVar.b;
        } else {
            j = 0;
        }
        this.e = j;
        return erqt.i(fcafVar);
    }

    @Override // defpackage.ciin
    public final String f() {
        return "RetrieveRegistrationIdHandler";
    }

    @Override // defpackage.ciin
    public final String g() {
        return this.a;
    }

    @Override // defpackage.ciin
    public final /* synthetic */ void h(Throwable th) {
        ciim.c(this);
    }

    @Override // defpackage.ciin
    public final /* synthetic */ void i() {
        ciim.a(this);
    }

    @Override // defpackage.ciin
    public final /* synthetic */ void j() {
        ciim.b(this);
    }

    @Override // defpackage.cijo
    public final void k() {
    }

    @Override // defpackage.cijo
    public final /* synthetic */ void l() {
    }
}
