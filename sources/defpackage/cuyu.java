package defpackage;

import android.content.Context;
import j$.util.Collection;
import j$.util.DesugarCollections;
import j$.util.Map;
import j$.util.function.BiConsumer$CC;
import j$.util.function.Function$CC;
import java.util.concurrent.ExecutionException;
import java.util.function.BiConsumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuyu {
    public static final enhk a = enhk.o(cvam.C11N, etew.C11N, cvam.RCS, etew.RCS, cvam.NOT_YET_KNOWN, etew.NOT_YET_KNOWN, cvam.C11N_RCS, etew.C11N_RCS);
    public static final cskc b = cskc.g("Bugle", "VerifiedSmsInvestigativeRpcService");
    public final cvdc c;
    public final chkk d;
    public final cqoh e;
    public final ctwb f;
    public final Context g;
    public final errl h;
    public final errl i;

    public cuyu(cvdc cvdcVar, chkk chkkVar, cqoh cqohVar, ctwb ctwbVar, Context context, errl errlVar, errl errlVar2) {
        this.c = cvdcVar;
        this.d = chkkVar;
        this.e = cqohVar;
        this.f = ctwbVar;
        this.g = context;
        this.h = errlVar;
        this.i = errlVar2;
    }

    public static String a(String str, int i) {
        if (i == 3) {
            return str;
        }
        return str.hashCode() + "-redacted";
    }

    public static void b(final eteo eteoVar, elfl elflVar, elfl elflVar2, elfl elflVar3, final int i) {
        String str;
        cvas cvasVar;
        cvas cvasVar2 = cvas.a;
        final enhk enhkVar = enoz.a;
        try {
            cvasVar = (cvas) erqt.q(elflVar);
            str = "";
        } catch (ExecutionException e) {
            str = String.valueOf(e.getClass()) + ": " + e.getMessage();
            cvasVar = cvasVar2;
        }
        try {
            enhkVar = (enhk) erqt.q(elflVar2);
        } catch (ExecutionException e2) {
            str = str + ";keys: " + String.valueOf(e2.getClass()) + ": " + e2.getMessage();
        }
        enhk enhkVar2 = enoz.a;
        try {
            enhkVar2 = ((cvdb) erqt.q(elflVar3)).c();
        } catch (ExecutionException e3) {
            str = str + ";evicted-keys: " + String.valueOf(e3.getClass()) + ": " + e3.getMessage();
        }
        int size = cvasVar.d.size();
        eteoVar.copyOnWrite();
        etez etezVar = (etez) eteoVar.instance;
        etez etezVar2 = etez.a;
        etezVar.f = size;
        eyja eyjaVar = cvasVar.i;
        if (eyjaVar == null) {
            eyjaVar = eyja.a;
        }
        eteoVar.copyOnWrite();
        etez etezVar3 = (etez) eteoVar.instance;
        eyjaVar.getClass();
        etezVar3.n = eyjaVar;
        etezVar3.b |= 4;
        cvah cvahVar = cvasVar.j;
        if (cvahVar == null) {
            cvahVar = cvah.a;
        }
        boolean z = cvahVar.b;
        eteoVar.copyOnWrite();
        ((etez) eteoVar.instance).o = z;
        cvah cvahVar2 = cvasVar.j;
        if (cvahVar2 == null) {
            cvahVar2 = cvah.a;
        }
        boolean z2 = cvahVar2.c;
        eteoVar.copyOnWrite();
        ((etez) eteoVar.instance).p = z2;
        cvah cvahVar3 = cvasVar.j;
        if (cvahVar3 == null) {
            cvahVar3 = cvah.a;
        }
        eygr eygrVar = cvahVar3.d;
        eteoVar.copyOnWrite();
        etez etezVar4 = (etez) eteoVar.instance;
        eygr eygrVar2 = etezVar4.w;
        if (!eygrVar2.c()) {
            etezVar4.w = eyfy.mutableCopy(eygrVar2);
        }
        eydl.addAll(eygrVar, etezVar4.w);
        cvah cvahVar4 = cvasVar.j;
        if (cvahVar4 == null) {
            cvahVar4 = cvah.a;
        }
        eygr eygrVar3 = cvahVar4.e;
        eteoVar.copyOnWrite();
        etez etezVar5 = (etez) eteoVar.instance;
        eygr eygrVar4 = etezVar5.x;
        if (!eygrVar4.c()) {
            etezVar5.x = eyfy.mutableCopy(eygrVar4);
        }
        eydl.addAll(eygrVar3, etezVar5.x);
        eteoVar.copyOnWrite();
        ((etez) eteoVar.instance).u = str;
        long j = cvasVar.k;
        eteoVar.copyOnWrite();
        ((etez) eteoVar.instance).v = j;
        Map.EL.forEach(DesugarCollections.unmodifiableMap(cvasVar.e), new BiConsumer() { // from class: cuyt
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                String str2 = (String) obj;
                cvan cvanVar = (cvan) obj2;
                String a2 = cuyu.a(str2, i);
                etev etevVar = (etev) etex.a.createBuilder();
                eyee eyeeVar = cvanVar.d;
                etevVar.copyOnWrite();
                etex etexVar = (etex) etevVar.instance;
                eyeeVar.getClass();
                etexVar.e = eyeeVar;
                String str3 = cvanVar.e;
                etevVar.copyOnWrite();
                etex etexVar2 = (etex) etevVar.instance;
                str3.getClass();
                etexVar2.f = str3;
                eyja d = eykm.d(cvanVar.c);
                etevVar.copyOnWrite();
                etex etexVar3 = (etex) etevVar.instance;
                d.getClass();
                etexVar3.d = d;
                etexVar3.b |= 1;
                enhk enhkVar3 = cuyu.a;
                cvam b2 = cvam.b(cvanVar.f);
                if (b2 == null) {
                    b2 = cvam.UNRECOGNIZED;
                }
                enhk enhkVar4 = enhkVar;
                etew etewVar = (etew) enhkVar3.getOrDefault(b2, etew.UNKNOWN_TYPE);
                etevVar.copyOnWrite();
                ((etex) etevVar.instance).g = etewVar.a();
                int i2 = engw.d;
                Iterable iterable = (Iterable) enhkVar4.getOrDefault(str2, enou.a);
                etevVar.copyOnWrite();
                etex etexVar4 = (etex) etevVar.instance;
                eygr eygrVar5 = etexVar4.c;
                if (!eygrVar5.c()) {
                    etexVar4.c = eyfy.mutableCopy(eygrVar5);
                }
                eydl.addAll(iterable, etexVar4.c);
                Iterable iterable2 = (Iterable) Collection.EL.stream(cvanVar.b).map(new Function() { // from class: cuys
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj3) {
                        eyja eyjaVar2 = ((cvbt) obj3).e;
                        return eyjaVar2 == null ? eyja.a : eyjaVar2;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(endq.a);
                etevVar.copyOnWrite();
                etex etexVar5 = (etex) etevVar.instance;
                eygr eygrVar6 = etexVar5.h;
                if (!eygrVar6.c()) {
                    etexVar5.h = eyfy.mutableCopy(eygrVar6);
                }
                eteo eteoVar2 = eteo.this;
                eydl.addAll(iterable2, etexVar5.h);
                etex etexVar6 = (etex) etevVar.build();
                a2.getClass();
                etexVar6.getClass();
                eteoVar2.copyOnWrite();
                etez etezVar6 = (etez) eteoVar2.instance;
                etez etezVar7 = etez.a;
                eyhm eyhmVar = etezVar6.c;
                if (!eyhmVar.b) {
                    etezVar6.c = eyhmVar.a();
                }
                etezVar6.c.put(a2, etexVar6);
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        });
        Map.EL.forEach(enhkVar2, new BiConsumer() { // from class: cuyk
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                String str2 = (String) obj;
                engw engwVar = (engw) obj2;
                enhk enhkVar3 = cuyu.a;
                if (engwVar.isEmpty()) {
                    return;
                }
                int i2 = i;
                eteo eteoVar2 = eteo.this;
                String a2 = cuyu.a(str2, i2);
                etes etesVar = etes.a;
                a2.getClass();
                java.util.Map unmodifiableMap = DesugarCollections.unmodifiableMap(((etez) eteoVar2.instance).y);
                if (unmodifiableMap.containsKey(a2)) {
                    etesVar = (etes) unmodifiableMap.get(a2);
                }
                eter eterVar = (eter) etesVar.toBuilder();
                int size2 = engwVar.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    cvda cvdaVar = (cvda) engwVar.get(i3);
                    etep etepVar = (etep) eteq.a.createBuilder();
                    eyee a3 = cvdaVar.a();
                    etepVar.copyOnWrite();
                    ((eteq) etepVar.instance).c = a3;
                    eyja b2 = cvdaVar.b();
                    etepVar.copyOnWrite();
                    eteq eteqVar = (eteq) etepVar.instance;
                    eteqVar.d = b2;
                    eteqVar.b |= 1;
                    eteq eteqVar2 = (eteq) etepVar.build();
                    eterVar.copyOnWrite();
                    etes etesVar2 = (etes) eterVar.instance;
                    eteqVar2.getClass();
                    eygr eygrVar5 = etesVar2.b;
                    if (!eygrVar5.c()) {
                        etesVar2.b = eyfy.mutableCopy(eygrVar5);
                    }
                    etesVar2.b.add(eteqVar2);
                }
                etes etesVar3 = (etes) eterVar.build();
                a2.getClass();
                etesVar3.getClass();
                eteoVar2.copyOnWrite();
                etez etezVar6 = (etez) eteoVar2.instance;
                eyhm eyhmVar = etezVar6.y;
                if (!eyhmVar.b) {
                    etezVar6.y = eyhmVar.a();
                }
                etezVar6.y.put(a2, etesVar3);
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        });
    }
}
