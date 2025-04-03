package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.logging.Level;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class edbv {
    public final ecvo a;
    public final Uri b;
    public final String c;
    public final String d;
    public final boolean e;

    public edbv(ecvo ecvoVar, String str, String str2, boolean z) {
        this.a = ecvoVar;
        this.c = str;
        this.d = str2;
        this.e = z;
        Context context = ecvoVar.d;
        Pattern pattern = efbs.a;
        efbr efbrVar = new efbr(context);
        efbrVar.f("phenotype");
        efbrVar.g(str2 + "/" + str + ".pb");
        if (z) {
            int i = dubc.a;
            efbrVar.d();
        }
        this.b = efbrVar.a();
    }

    final ListenableFuture a(String str) {
        return erny.f(this.a.b().c(this.c, str), new emwl() { // from class: edbp
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ecww ecwwVar = (ecww) obj;
                edbw edbwVar = (edbw) edbx.a.createBuilder();
                if (ecwwVar == null) {
                    return (edbx) edbwVar.build();
                }
                for (ecxb ecxbVar : ecwwVar.f) {
                    edby edbyVar = (edby) edbz.a.createBuilder();
                    String str2 = ecxbVar.e;
                    edbyVar.copyOnWrite();
                    edbz edbzVar = (edbz) edbyVar.instance;
                    str2.getClass();
                    edbzVar.b |= 1;
                    edbzVar.e = str2;
                    int i = ecxbVar.c;
                    int a = ecxa.a(i);
                    if (a == 0) {
                        throw null;
                    }
                    int i2 = a - 1;
                    if (i2 == 0) {
                        long longValue = i == 1 ? ((Long) ecxbVar.d).longValue() : 0L;
                        edbyVar.copyOnWrite();
                        edbz edbzVar2 = (edbz) edbyVar.instance;
                        edbzVar2.c = 2;
                        edbzVar2.d = Long.valueOf(longValue);
                    } else if (i2 == 1) {
                        boolean booleanValue = i == 2 ? ((Boolean) ecxbVar.d).booleanValue() : false;
                        edbyVar.copyOnWrite();
                        edbz edbzVar3 = (edbz) edbyVar.instance;
                        edbzVar3.c = 3;
                        edbzVar3.d = Boolean.valueOf(booleanValue);
                    } else if (i2 == 2) {
                        double doubleValue = i == 3 ? ((Double) ecxbVar.d).doubleValue() : eobe.a;
                        edbyVar.copyOnWrite();
                        edbz edbzVar4 = (edbz) edbyVar.instance;
                        edbzVar4.c = 4;
                        edbzVar4.d = Double.valueOf(doubleValue);
                    } else if (i2 == 3) {
                        String str3 = i == 4 ? (String) ecxbVar.d : "";
                        edbyVar.copyOnWrite();
                        edbz edbzVar5 = (edbz) edbyVar.instance;
                        str3.getClass();
                        edbzVar5.c = 5;
                        edbzVar5.d = str3;
                    } else {
                        if (i2 != 4) {
                            throw new IllegalStateException("No known flag type");
                        }
                        eyee eyeeVar = i == 5 ? (eyee) ecxbVar.d : eyee.b;
                        edbyVar.copyOnWrite();
                        edbz edbzVar6 = (edbz) edbyVar.instance;
                        eyeeVar.getClass();
                        edbzVar6.c = 6;
                        edbzVar6.d = eyeeVar;
                    }
                    edbz edbzVar7 = (edbz) edbyVar.build();
                    edbwVar.copyOnWrite();
                    edbx edbxVar = (edbx) edbwVar.instance;
                    edbzVar7.getClass();
                    eygr eygrVar = edbxVar.g;
                    if (!eygrVar.c()) {
                        edbxVar.g = eyfy.mutableCopy(eygrVar);
                    }
                    edbxVar.g.add(edbzVar7);
                }
                String str4 = ecwwVar.e;
                edbwVar.copyOnWrite();
                edbx edbxVar2 = (edbx) edbwVar.instance;
                str4.getClass();
                edbxVar2.b = 4 | edbxVar2.b;
                edbxVar2.e = str4;
                String str5 = ecwwVar.c;
                edbwVar.copyOnWrite();
                edbx edbxVar3 = (edbx) edbwVar.instance;
                str5.getClass();
                edbxVar3.b = 1 | edbxVar3.b;
                edbxVar3.c = str5;
                long j = ecwwVar.i;
                edbwVar.copyOnWrite();
                edbx edbxVar4 = (edbx) edbwVar.instance;
                edbxVar4.b |= 8;
                edbxVar4.f = j;
                if ((ecwwVar.b & 2) != 0) {
                    eyee eyeeVar2 = ecwwVar.d;
                    edbwVar.copyOnWrite();
                    edbx edbxVar5 = (edbx) edbwVar.instance;
                    eyeeVar2.getClass();
                    edbxVar5.b |= 2;
                    edbxVar5.d = eyeeVar2;
                }
                return (edbx) edbwVar.build();
            }
        }, this.a.e());
    }

    public final ListenableFuture b(final edbx edbxVar) {
        return erqt.m(new Callable() { // from class: edbq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                efcf efcfVar = new efcf();
                edbv edbvVar = edbv.this;
                edbx edbxVar2 = edbxVar;
                try {
                    efbm c = edbvVar.a.c();
                    Uri uri = edbvVar.b;
                    efec efecVar = new efec(edbxVar2);
                    efecVar.a = new efcf[]{efcfVar};
                    return null;
                } catch (IOException | RuntimeException e) {
                    ecwm.a(Level.WARNING, edbvVar.a.e(), e, "Failed to update snapshot for %s flags may be stale.", edbvVar.c);
                    return null;
                }
            }
        }, this.a.e());
    }

    final boolean c() {
        return this.a.f.a(this.e).a(eull.FILE);
    }
}
