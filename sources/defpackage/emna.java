package defpackage;

import com.google.chat.smartmessaging.smartreply.android.models.assistant.IntentClassifierJni;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emna implements emnk {
    private final IntentClassifierJni a;
    private final int b;
    private final float c;
    private final boolean d;
    private final engy e;
    private final float f;
    private final enhk g;
    private final enhk h;

    public emna(IntentClassifierJni intentClassifierJni, int i, float f, boolean z, engy engyVar, float f2, enhk enhkVar, enhk enhkVar2) {
        this.a = intentClassifierJni;
        this.b = i;
        this.c = f;
        this.d = z;
        this.e = engyVar;
        this.f = f2;
        this.g = enhkVar;
        this.h = enhkVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.emnk
    public final engw a(fbup fbupVar, String str, emrk emrkVar) {
        boolean z;
        engw engwVar;
        sec secVar;
        String str2;
        sed sedVar = (sed) sei.a.createBuilder();
        ArrayList arrayList = new ArrayList(fbupVar.b.size());
        for (fbun fbunVar : fbupVar.b) {
            if (fbunVar.b == 30) {
                see seeVar = (see) seh.a.createBuilder();
                String str3 = fbunVar.b == 30 ? (String) fbunVar.c : "";
                seeVar.copyOnWrite();
                seh sehVar = (seh) seeVar.instance;
                str3.getClass();
                sehVar.b = str3;
                long j = fbunVar.e;
                seeVar.copyOnWrite();
                ((seh) seeVar.instance).c = j;
                boolean z2 = true;
                int i = true != fbunVar.d.equals(str) ? 4 : 3;
                seeVar.copyOnWrite();
                ((seh) seeVar.instance).e = i - 2;
                for (fbuk fbukVar : fbunVar.f) {
                    enhk enhkVar = this.g;
                    fbqt b = fbqt.b(fbukVar.e);
                    if (b == null) {
                        b = fbqt.UNRECOGNIZED;
                    }
                    Float f = (Float) enhkVar.getOrDefault(b, Float.valueOf(0.0f));
                    float floatValue = f.floatValue();
                    fbqt b2 = fbqt.b(fbukVar.e);
                    if (b2 == null) {
                        b2 = fbqt.UNRECOGNIZED;
                    }
                    if (b2 == fbqt.WEBREF_ANNOTATION) {
                        floatValue = ((Float) this.h.getOrDefault((fbukVar.c == 9 ? (fbxy) fbukVar.d : fbxy.a).c, f)).floatValue();
                    }
                    if (floatValue > this.f) {
                        sef sefVar = (sef) seg.a.createBuilder();
                        int i2 = fbukVar.h;
                        sefVar.copyOnWrite();
                        ((seg) sefVar.instance).c = i2;
                        int i3 = fbukVar.i;
                        sefVar.copyOnWrite();
                        ((seg) sefVar.instance).d = i3;
                        sefVar.copyOnWrite();
                        ((seg) sefVar.instance).e = floatValue;
                        fbqt b3 = fbqt.b(fbukVar.e);
                        if (b3 == null) {
                            b3 = fbqt.UNRECOGNIZED;
                        }
                        int ordinal = b3.ordinal();
                        z = z2;
                        if (ordinal == 5) {
                            seb sebVar = (seb) sec.a.createBuilder();
                            String str4 = (fbukVar.c == 6 ? (fbsk) fbukVar.d : fbsk.a).d;
                            sebVar.copyOnWrite();
                            sec secVar2 = (sec) sebVar.instance;
                            str4.getClass();
                            secVar2.b = str4;
                            sebVar.copyOnWrite();
                            ((sec) sebVar.instance).c = sea.a(10);
                            secVar = (sec) sebVar.build();
                        } else if (ordinal == 6) {
                            seb sebVar2 = (seb) sec.a.createBuilder();
                            fbrx fbrxVar = fbukVar.c == 7 ? (fbrx) fbukVar.d : fbrx.a;
                            fbvj fbvjVar = fbrxVar.d;
                            if (fbvjVar == null) {
                                fbvjVar = fbvj.a;
                            }
                            if (fbvjVar.d.isEmpty()) {
                                fbvl fbvlVar = fbrxVar.e;
                                if (fbvlVar == null) {
                                    fbvlVar = fbvl.a;
                                }
                                if (fbvlVar.c.isEmpty()) {
                                    fbxs fbxsVar = fbrxVar.f;
                                    if (fbxsVar == null) {
                                        fbxsVar = fbxs.a;
                                    }
                                    if (!fbxsVar.b.isEmpty()) {
                                        fbxs fbxsVar2 = fbrxVar.f;
                                        if (fbxsVar2 == null) {
                                            fbxsVar2 = fbxs.a;
                                        }
                                        str2 = fbxsVar2.b;
                                    } else if ((fbrxVar.b & 1) != 0) {
                                        fbvn fbvnVar = fbrxVar.c;
                                        if (fbvnVar == null) {
                                            fbvnVar = fbvn.a;
                                        }
                                        StringBuilder sb = new StringBuilder();
                                        String[] strArr = {fbvnVar.b, fbvnVar.c, fbvnVar.e, fbvnVar.f, fbvnVar.g};
                                        for (int i4 = 0; i4 < 5; i4++) {
                                            String str5 = strArr[i4];
                                            if (!str5.isEmpty()) {
                                                if (sb.length() != 0) {
                                                    sb.append(", ");
                                                }
                                                sb.append(str5);
                                            }
                                        }
                                        str2 = sb.toString();
                                    } else {
                                        str2 = "";
                                    }
                                } else {
                                    fbvl fbvlVar2 = fbrxVar.e;
                                    if (fbvlVar2 == null) {
                                        fbvlVar2 = fbvl.a;
                                    }
                                    str2 = fbvlVar2.c;
                                }
                            } else {
                                fbvj fbvjVar2 = fbrxVar.d;
                                if (fbvjVar2 == null) {
                                    fbvjVar2 = fbvj.a;
                                }
                                str2 = fbvjVar2.d;
                            }
                            sebVar2.copyOnWrite();
                            sec secVar3 = (sec) sebVar2.instance;
                            str2.getClass();
                            secVar3.b = str2;
                            sebVar2.copyOnWrite();
                            ((sec) sebVar2.instance).c = sea.a(4);
                            secVar = (sec) sebVar2.build();
                        } else if (ordinal == 7) {
                            seb sebVar3 = (seb) sec.a.createBuilder();
                            String str6 = (fbukVar.c == 9 ? (fbxy) fbukVar.d : fbxy.a).d;
                            sebVar3.copyOnWrite();
                            sec secVar4 = (sec) sebVar3.instance;
                            str6.getClass();
                            secVar4.b = str6;
                            String str7 = (fbukVar.c == 9 ? (fbxy) fbukVar.d : fbxy.a).c;
                            sebVar3.copyOnWrite();
                            sec secVar5 = (sec) sebVar3.instance;
                            str7.getClass();
                            eygr eygrVar = secVar5.d;
                            if (!eygrVar.c()) {
                                secVar5.d = eyfy.mutableCopy(eygrVar);
                            }
                            secVar5.d.add(str7);
                            secVar = (sec) sebVar3.build();
                        } else if (ordinal == 9) {
                            seb sebVar4 = (seb) sec.a.createBuilder();
                            fceq fceqVar = (fbukVar.c == 11 ? (fbuu) fbukVar.d : fbuu.a).c;
                            if (fceqVar == null) {
                                fceqVar = fceq.a;
                            }
                            long j2 = fceqVar.b;
                            String concat = j2 == 0 ? "" : String.valueOf(String.valueOf(j2)).concat(String.valueOf(fceqVar.c));
                            sebVar4.copyOnWrite();
                            ((sec) sebVar4.instance).b = concat;
                            sebVar4.copyOnWrite();
                            ((sec) sebVar4.instance).c = sea.a(13);
                            secVar = (sec) sebVar4.build();
                        } else if (ordinal != 10) {
                            secVar = sec.a;
                        } else {
                            seb sebVar5 = (seb) sec.a.createBuilder();
                            sebVar5.copyOnWrite();
                            ((sec) sebVar5.instance).c = sea.a(7);
                            secVar = (sec) sebVar5.build();
                        }
                        sefVar.copyOnWrite();
                        seg segVar = (seg) sefVar.instance;
                        secVar.getClass();
                        segVar.f = secVar;
                        segVar.b |= 1;
                        engwVar = engw.r((seg) sefVar.build());
                    } else {
                        z = z2;
                        int i5 = engw.d;
                        engwVar = enou.a;
                    }
                    seeVar.copyOnWrite();
                    seh sehVar2 = (seh) seeVar.instance;
                    eygr eygrVar2 = sehVar2.d;
                    if (!eygrVar2.c()) {
                        sehVar2.d = eyfy.mutableCopy(eygrVar2);
                    }
                    eydl.addAll(engwVar, sehVar2.d);
                    z2 = z;
                }
                arrayList.add((seh) seeVar.build());
            }
        }
        List subList = arrayList.subList(Math.max(0, arrayList.size() - this.b), arrayList.size());
        sedVar.copyOnWrite();
        sei seiVar = (sei) sedVar.instance;
        eygr eygrVar3 = seiVar.b;
        if (!eygrVar3.c()) {
            seiVar.b = eyfy.mutableCopy(eygrVar3);
        }
        IntentClassifierJni intentClassifierJni = this.a;
        eydl.addAll(subList, seiVar.b);
        sedVar.copyOnWrite();
        ((sei) sedVar.instance).c = "en";
        float f2 = this.c;
        sedVar.copyOnWrite();
        ((sei) sedVar.instance).d = f2;
        sei seiVar2 = (sei) sedVar.build();
        boolean z3 = this.d;
        long j3 = ((emnb) intentClassifierJni).a.get();
        if (j3 == 0) {
            throw new emlq("Handle destroyed.");
        }
        try {
            byte[] nativeClassify = IntentClassifierJni.nativeClassify(j3, seiVar2.toByteArray(), z3);
            if (nativeClassify == null) {
                throw new emlq("Native classiflier failed.");
            }
            try {
                sek sekVar = (sek) eyfy.parseFrom(sek.a, nativeClassify, eyfc.a());
                int i6 = engw.d;
                engw engwVar2 = enou.a;
                float f3 = 0.0f;
                for (seq seqVar : sekVar.b) {
                    if (seqVar.b > f3) {
                        engy engyVar = this.e;
                        sem semVar = seqVar.c;
                        if (semVar == null) {
                            semVar = sem.a;
                        }
                        seo b4 = seo.b(semVar.b);
                        if (b4 == null) {
                            b4 = seo.UNRECOGNIZED;
                        }
                        if (engyVar.s(b4)) {
                            engr engrVar = new engr();
                            engy engyVar2 = this.e;
                            sem semVar2 = seqVar.c;
                            if (semVar2 == null) {
                                semVar2 = sem.a;
                            }
                            seo b5 = seo.b(semVar2.b);
                            if (b5 == null) {
                                b5 = seo.UNRECOGNIZED;
                            }
                            engw a = engyVar2.a(b5);
                            int size = a.size();
                            for (int i7 = 0; i7 < size; i7++) {
                                emil emilVar = (emil) a.get(i7);
                                engr engrVar2 = new engr();
                                sec secVar6 = seqVar.d;
                                if (secVar6 == null) {
                                    secVar6 = sec.a;
                                }
                                if (!secVar6.b.isEmpty()) {
                                    emng h = emnh.h();
                                    sec secVar7 = seqVar.d;
                                    if (secVar7 == null) {
                                        secVar7 = sec.a;
                                    }
                                    h.f(secVar7.b);
                                    h.g(emilVar.d);
                                    sec secVar8 = seqVar.d;
                                    if (secVar8 == null) {
                                        secVar8 = sec.a;
                                    }
                                    h.e(secVar8.d.size() > 0 ? (String) secVar8.d.get(0) : "");
                                    engrVar2.h(h.a());
                                }
                                emni f4 = emnj.f();
                                f4.e(fbrg.ASSISTANT);
                                f4.c(emilVar.c);
                                f4.d(seqVar.b);
                                f4.b(engrVar2.g());
                                engrVar.h(f4.a());
                            }
                            engwVar2 = engrVar.g();
                            f3 = seqVar.b;
                        }
                    }
                }
                return engwVar2;
            } catch (eygu e) {
                throw new emlq("Failed to parse the response: ".concat(String.valueOf(e.getMessage())), (Exception) e);
            }
        } catch (Throwable th) {
            throw new emlq("Unexpected exception: ".concat(String.valueOf(th.getMessage())), th);
        }
    }

    @Override // defpackage.emnk
    public final /* synthetic */ void b() {
    }
}
