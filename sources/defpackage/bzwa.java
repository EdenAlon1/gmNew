package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.communication.synapse.security.scytale.UserDevices;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzwa implements ciin {
    private static final cskc a = cskc.g("BugleEtouffee", "DownloadPreKeysHandler");
    private final ArrayList b;
    private final String c;
    private String d = "";
    private long e = 0;

    public bzwa(ArrayList arrayList, String str) {
        this.b = arrayList;
        this.c = str;
    }

    @Override // defpackage.ciin
    public final long a() {
        return this.e;
    }

    @Override // defpackage.ciin
    public final ciil b() {
        return new ciii(this.c);
    }

    @Override // defpackage.ciin
    public final ListenableFuture c(fcfo fcfoVar) {
        fckz fckzVar = (fckz) fcla.a.createBuilder();
        fckzVar.copyOnWrite();
        ((fcla) fckzVar.instance).e = 3;
        fckzVar.copyOnWrite();
        ((fcla) fckzVar.instance).f = 3;
        fckzVar.copyOnWrite();
        fcla fclaVar = (fcla) fckzVar.instance;
        fcfoVar.getClass();
        fclaVar.c = fcfoVar;
        fclaVar.b |= 1;
        fckzVar.copyOnWrite();
        ((fcla) fckzVar.instance).g = false;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            UserDevices userDevices = (UserDevices) arrayList.get(i);
            Stream map = Collection.EL.stream(userDevices.getDeviceIds()).map(new Function() { // from class: bzvz
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return eyee.A((String) obj);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            int i2 = engw.d;
            Iterable iterable = (Iterable) map.collect(endq.a);
            fcfz fcfzVar = (fcfz) fcga.a.createBuilder();
            fcej fcejVar = (fcej) fcek.a.createBuilder();
            fcejVar.copyOnWrite();
            ((fcek) fcejVar.instance).d = "RCS";
            fgtg fgtgVar = fgtg.PHONE_NUMBER;
            fcejVar.copyOnWrite();
            ((fcek) fcejVar.instance).b = fgtgVar.a();
            String userId = userDevices.getUserId();
            fcejVar.copyOnWrite();
            fcek fcekVar = (fcek) fcejVar.instance;
            userId.getClass();
            fcekVar.c = userId;
            fcfzVar.copyOnWrite();
            fcga fcgaVar = (fcga) fcfzVar.instance;
            fcek fcekVar2 = (fcek) fcejVar.build();
            fcekVar2.getClass();
            fcgaVar.c = fcekVar2;
            fcgaVar.b |= 1;
            fcfzVar.copyOnWrite();
            fcga fcgaVar2 = (fcga) fcfzVar.instance;
            eygr eygrVar = fcgaVar2.d;
            if (!eygrVar.c()) {
                fcgaVar2.d = eyfy.mutableCopy(eygrVar);
            }
            eydl.addAll(iterable, fcgaVar2.d);
            fcga fcgaVar3 = (fcga) fcfzVar.build();
            fckzVar.copyOnWrite();
            fcla fclaVar2 = (fcla) fckzVar.instance;
            fcgaVar3.getClass();
            eygr eygrVar2 = fclaVar2.d;
            if (!eygrVar2.c()) {
                fclaVar2.d = eyfy.mutableCopy(eygrVar2);
            }
            fclaVar2.d.add(fcgaVar3);
        }
        this.d = fcfoVar.c;
        return erqt.i((fcla) fckzVar.build());
    }

    @Override // defpackage.ciin
    public final /* bridge */ /* synthetic */ ListenableFuture d(chrv chrvVar, eyhs eyhsVar) {
        fcla fclaVar = (fcla) eyhsVar;
        csjb d = a.d();
        d.I("Sent");
        d.A("GetPreKeyBatchRequest", fclaVar);
        d.r();
        fcej fcejVar = (fcej) fcek.a.createBuilder();
        fcejVar.copyOnWrite();
        ((fcek) fcejVar.instance).c = this.c;
        return chrvVar.d((fcek) fcejVar.build()).b(fclaVar);
    }

    @Override // defpackage.ciin
    public final /* bridge */ /* synthetic */ ListenableFuture e(eyhs eyhsVar) {
        long j;
        fclg fclgVar = (fclg) eyhsVar;
        if (fclgVar != null) {
            fcfq fcfqVar = fclgVar.b;
            if (fcfqVar == null) {
                fcfqVar = fcfq.a;
            }
            j = fcfqVar.b;
        } else {
            j = 0;
        }
        this.e = j;
        return erqt.i(fclgVar);
    }

    @Override // defpackage.ciin
    public final String f() {
        return "DownloadPreKeysHandler";
    }

    @Override // defpackage.ciin
    public final String g() {
        return this.d;
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
