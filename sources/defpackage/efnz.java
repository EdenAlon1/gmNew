package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.Log;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efnz extends efog {
    private feau f;
    private String g;
    private final efnq h;

    public efnz(Context context, String str, String str2, String str3, efnq efnqVar) {
        super(context, str, str2, str3);
        this.h = efnqVar;
    }

    static final febj e() {
        febf febfVar = febo.c;
        int i = febj.d;
        return new febe("Cookie", febfVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0047 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.emby a() {
        /*
            r7 = this;
            android.content.Context r0 = r7.a
            java.lang.String r1 = r7.c
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            java.lang.String r3 = "GoogleAuthProviderImpl"
            r4 = 0
            if (r2 == 0) goto L14
            java.lang.String r0 = "Account was not set."
            android.util.Log.w(r3, r0)
        L12:
            r0 = r4
            goto L40
        L14:
            embm r2 = new embm     // Catch: java.lang.Exception -> L32 com.google.android.gms.auth.UserRecoverableAuthException -> L39
            android.accounts.Account r5 = new android.accounts.Account     // Catch: java.lang.Exception -> L32 com.google.android.gms.auth.UserRecoverableAuthException -> L39
            java.lang.String r6 = "com.google"
            r5.<init>(r1, r6)     // Catch: java.lang.Exception -> L32 com.google.android.gms.auth.UserRecoverableAuthException -> L39
            java.lang.String r1 = "oauth2:https://www.googleapis.com/auth/supportcontent"
            int r6 = defpackage.dezv.a     // Catch: java.lang.Exception -> L32 com.google.android.gms.auth.UserRecoverableAuthException -> L39
            java.lang.String r0 = defpackage.dfac.d(r0, r5, r1)     // Catch: java.lang.Exception -> L32 com.google.android.gms.auth.UserRecoverableAuthException -> L39
            r2.<init>(r0, r4)     // Catch: java.lang.Exception -> L32 com.google.android.gms.auth.UserRecoverableAuthException -> L39
            efmr r0 = new efmr     // Catch: java.lang.Exception -> L32 com.google.android.gms.auth.UserRecoverableAuthException -> L39
            emby r1 = defpackage.emby.d(r2)     // Catch: java.lang.Exception -> L32 com.google.android.gms.auth.UserRecoverableAuthException -> L39
            r0.<init>(r1)     // Catch: java.lang.Exception -> L32 com.google.android.gms.auth.UserRecoverableAuthException -> L39
            goto L40
        L32:
            r0 = move-exception
            java.lang.String r1 = "Exception occurred while getting auth credentials"
            android.util.Log.e(r3, r1, r0)
            goto L12
        L39:
            r0 = move-exception
            java.lang.String r1 = "User recoverable exception happened while getting authentication token. You need to allowlist your application."
            android.util.Log.e(r3, r1, r0)
            goto L12
        L40:
            boolean r1 = r0 instanceof defpackage.efmr
            if (r1 == 0) goto L47
            emby r0 = r0.a
            return r0
        L47:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.efnz.a():emby");
    }

    public final fdxk b(emby embyVar) {
        String str;
        efne efneVar;
        try {
            long j = efow.a;
            if (TextUtils.isEmpty(this.g) && (efneVar = efmu.a.c) != null) {
                this.g = efneVar.a();
            }
            this.f = fehv.l(efmu.a.a(), 443, this.h.a).a();
            String str2 = this.g;
            febo feboVar = new febo();
            efpb efpbVar = efor.c;
            if (!efor.b(fdvp.a.get().b(efor.b))) {
                feboVar.g(e(), str2);
            } else if (embyVar == null && !TextUtils.isEmpty(str2)) {
                feboVar.g(e(), str2);
            }
            if (!TextUtils.isEmpty(this.d)) {
                febf febfVar = febo.c;
                int i = febj.d;
                feboVar.g(new febe("X-Goog-Api-Key", febfVar), this.d);
            }
            Context context = this.a;
            try {
                str = efow.e(context.getPackageManager().getPackageInfo(context.getPackageName(), 64));
            } catch (PackageManager.NameNotFoundException e) {
                Log.e("SurveyUtils", "Package not found.", e);
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                febf febfVar2 = febo.c;
                int i2 = febj.d;
                feboVar.g(new febe("X-Android-Cert", febfVar2), str);
            }
            String packageName = this.a.getPackageName();
            if (!TextUtils.isEmpty(packageName)) {
                febf febfVar3 = febo.c;
                int i3 = febj.d;
                feboVar.g(new febe("X-Android-Package", febfVar3), packageName);
            }
            febf febfVar4 = febo.c;
            int i4 = febj.d;
            feboVar.g(new febe("Authority", febfVar4), efmu.a.a());
            return fdxr.b(this.f, new ffaw(feboVar));
        } catch (Exception e2) {
            Log.e("NetworkCallerGrpc", "Could not get managed channel.", e2);
            d();
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x021c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ void c(defpackage.fags r9, defpackage.efou r10) {
        /*
            Method dump skipped, instructions count: 541
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.efnz.c(fags, efou):void");
    }

    public final void d() {
        feau feauVar = this.f;
        if (feauVar != null) {
            feauVar.d();
        }
    }

    public final void f(fago fagoVar, efou efouVar) {
        long j = efow.a;
        String str = TextUtils.isEmpty(this.c) ? null : this.c;
        efpb efpbVar = efor.c;
        if (efor.c(fdul.b(efor.b))) {
            faau faauVar = (faau) faav.a.createBuilder();
            char c = 2;
            if ((fagoVar.b & 1) != 0) {
                faiu faiuVar = fagoVar.c;
                if (faiuVar == null) {
                    faiuVar = faiu.a;
                }
                ezya ezyaVar = (ezya) ezyv.a.createBuilder();
                if ((faiuVar.b & 1) != 0) {
                    eyev eyevVar = faiuVar.e;
                    if (eyevVar == null) {
                        eyevVar = eyev.a;
                    }
                    ezyaVar.copyOnWrite();
                    ezyv ezyvVar = (ezyv) ezyaVar.instance;
                    eyevVar.getClass();
                    ezyvVar.e = eyevVar;
                    ezyvVar.b |= 1;
                }
                int i = faiuVar.c;
                int i2 = i != 0 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? i != 6 ? 0 : 5 : 4 : 3 : 2 : 1 : 6;
                if (i2 == 0) {
                    throw null;
                }
                int i3 = i2 - 1;
                if (i3 == 0) {
                    ezyu ezyuVar = ezyu.a;
                    ezyaVar.copyOnWrite();
                    ezyv ezyvVar2 = (ezyv) ezyaVar.instance;
                    ezyuVar.getClass();
                    ezyvVar2.d = ezyuVar;
                    ezyvVar2.c = 2;
                } else if (i3 == 1) {
                    faip faipVar = i == 3 ? (faip) faiuVar.d : faip.a;
                    ezyp ezypVar = (ezyp) ezyq.a.createBuilder();
                    if ((faipVar.b & 2) != 0) {
                        fajm fajmVar = faipVar.c;
                        if (fajmVar == null) {
                            fajmVar = fajm.a;
                        }
                        ezzw ezzwVar = (ezzw) ezzz.a.createBuilder();
                        String str2 = fajmVar.d;
                        ezzwVar.copyOnWrite();
                        ezzz ezzzVar = (ezzz) ezzwVar.instance;
                        str2.getClass();
                        ezzzVar.d = str2;
                        if ((fajmVar.b & 1) != 0) {
                            ezzx ezzxVar = (ezzx) ezzy.a.createBuilder();
                            fajl fajlVar = fajmVar.c;
                            if (fajlVar == null) {
                                fajlVar = fajl.a;
                            }
                            eygr eygrVar = fajlVar.c;
                            ezzxVar.copyOnWrite();
                            ezzy ezzyVar = (ezzy) ezzxVar.instance;
                            eygr eygrVar2 = ezzyVar.b;
                            if (!eygrVar2.c()) {
                                ezzyVar.b = eyfy.mutableCopy(eygrVar2);
                            }
                            eydl.addAll(eygrVar, ezzyVar.b);
                            ezzwVar.copyOnWrite();
                            ezzz ezzzVar2 = (ezzz) ezzwVar.instance;
                            ezzy ezzyVar2 = (ezzy) ezzxVar.build();
                            ezzyVar2.getClass();
                            ezzzVar2.c = ezzyVar2;
                            ezzzVar2.b |= 1;
                        }
                        ezypVar.copyOnWrite();
                        ezyq ezyqVar = (ezyq) ezypVar.instance;
                        ezzz ezzzVar3 = (ezzz) ezzwVar.build();
                        ezzzVar3.getClass();
                        ezyqVar.c = ezzzVar3;
                        ezyqVar.b |= 1;
                    }
                    if ((faipVar.b & 4) != 0) {
                        faki fakiVar = faipVar.d;
                        if (fakiVar == null) {
                            fakiVar = faki.a;
                        }
                        faae faaeVar = (faae) faap.a.createBuilder();
                        if ((fakiVar.b & 1) != 0) {
                            fakh fakhVar = fakiVar.c;
                            if (fakhVar == null) {
                                fakhVar = fakh.a;
                            }
                            faaf faafVar = (faaf) faao.a.createBuilder();
                            if ((fakhVar.b & 2) != 0) {
                                fakg fakgVar = fakhVar.c;
                                if (fakgVar == null) {
                                    fakgVar = fakg.a;
                                }
                                faag faagVar = (faag) faan.a.createBuilder();
                                if ((fakgVar.b & 1) != 0) {
                                    fakf fakfVar = fakgVar.c;
                                    if (fakfVar == null) {
                                        fakfVar = fakf.a;
                                    }
                                    faal faalVar = (faal) faam.a.createBuilder();
                                    String str3 = fakfVar.b;
                                    faalVar.copyOnWrite();
                                    faam faamVar = (faam) faalVar.instance;
                                    str3.getClass();
                                    faamVar.b = str3;
                                    String str4 = fakfVar.c;
                                    faalVar.copyOnWrite();
                                    faam faamVar2 = (faam) faalVar.instance;
                                    str4.getClass();
                                    faamVar2.c = str4;
                                    String str5 = fakfVar.d;
                                    faalVar.copyOnWrite();
                                    faam faamVar3 = (faam) faalVar.instance;
                                    str5.getClass();
                                    faamVar3.d = str5;
                                    String str6 = fakfVar.e;
                                    faalVar.copyOnWrite();
                                    faam faamVar4 = (faam) faalVar.instance;
                                    str6.getClass();
                                    faamVar4.e = str6;
                                    String str7 = fakfVar.f;
                                    faalVar.copyOnWrite();
                                    faam faamVar5 = (faam) faalVar.instance;
                                    str7.getClass();
                                    faamVar5.f = str7;
                                    faam faamVar6 = (faam) faalVar.build();
                                    faagVar.copyOnWrite();
                                    faan faanVar = (faan) faagVar.instance;
                                    faamVar6.getClass();
                                    faanVar.c = faamVar6;
                                    faanVar.b |= 1;
                                }
                                if ((fakgVar.b & 2) != 0) {
                                    fakd fakdVar = fakgVar.d;
                                    if (fakdVar == null) {
                                        fakdVar = fakd.a;
                                    }
                                    faah faahVar = (faah) faak.a.createBuilder();
                                    if (fakdVar.b.size() > 0) {
                                        for (fakc fakcVar : fakdVar.b) {
                                            faai faaiVar = (faai) faaj.a.createBuilder();
                                            String str8 = fakcVar.b;
                                            faaiVar.copyOnWrite();
                                            char c2 = c;
                                            faaj faajVar = (faaj) faaiVar.instance;
                                            str8.getClass();
                                            faajVar.b = str8;
                                            String str9 = fakcVar.c;
                                            faaiVar.copyOnWrite();
                                            faaj faajVar2 = (faaj) faaiVar.instance;
                                            str9.getClass();
                                            faajVar2.c = str9;
                                            faaj faajVar3 = (faaj) faaiVar.build();
                                            faahVar.copyOnWrite();
                                            faak faakVar = (faak) faahVar.instance;
                                            faajVar3.getClass();
                                            eygr eygrVar3 = faakVar.b;
                                            if (!eygrVar3.c()) {
                                                faakVar.b = eyfy.mutableCopy(eygrVar3);
                                            }
                                            faakVar.b.add(faajVar3);
                                            c = c2;
                                        }
                                    }
                                    faagVar.copyOnWrite();
                                    faan faanVar2 = (faan) faagVar.instance;
                                    faak faakVar2 = (faak) faahVar.build();
                                    faakVar2.getClass();
                                    faanVar2.d = faakVar2;
                                    faanVar2.b |= 2;
                                }
                                faafVar.copyOnWrite();
                                faao faaoVar = (faao) faafVar.instance;
                                faan faanVar3 = (faan) faagVar.build();
                                faanVar3.getClass();
                                faaoVar.c = faanVar3;
                                faaoVar.b |= 2;
                            }
                            faaeVar.copyOnWrite();
                            faap faapVar = (faap) faaeVar.instance;
                            faao faaoVar2 = (faao) faafVar.build();
                            faaoVar2.getClass();
                            faapVar.c = faaoVar2;
                            faapVar.b |= 1;
                        }
                        ezypVar.copyOnWrite();
                        ezyq ezyqVar2 = (ezyq) ezypVar.instance;
                        faap faapVar2 = (faap) faaeVar.build();
                        faapVar2.getClass();
                        ezyqVar2.d = faapVar2;
                        ezyqVar2.b |= 2;
                    }
                    ezyaVar.copyOnWrite();
                    ezyv ezyvVar3 = (ezyv) ezyaVar.instance;
                    ezyq ezyqVar3 = (ezyq) ezypVar.build();
                    ezyqVar3.getClass();
                    ezyvVar3.d = ezyqVar3;
                    ezyvVar3.c = 3;
                } else if (i3 == 2) {
                    ezyb ezybVar = (ezyb) ezyc.a.createBuilder();
                    boolean z = (faiuVar.c == 4 ? (fahz) faiuVar.d : fahz.a).b;
                    ezybVar.copyOnWrite();
                    ((ezyc) ezybVar.instance).b = z;
                    ezyaVar.copyOnWrite();
                    ezyv ezyvVar4 = (ezyv) ezyaVar.instance;
                    ezyc ezycVar = (ezyc) ezybVar.build();
                    ezycVar.getClass();
                    ezyvVar4.d = ezycVar;
                    ezyvVar4.c = 4;
                } else if (i3 == 3) {
                    fain fainVar = i == 5 ? (fain) faiuVar.d : fain.a;
                    ezyd ezydVar = (ezyd) ezyo.a.createBuilder();
                    int i4 = fainVar.d;
                    ezydVar.copyOnWrite();
                    ((ezyo) ezydVar.instance).d = i4;
                    int i5 = fainVar.b;
                    int a = faia.a(i5);
                    int i6 = a - 1;
                    if (a == 0) {
                        throw null;
                    }
                    if (i6 == 0) {
                        faim faimVar = i5 == 2 ? (faim) fainVar.c : faim.a;
                        ezym ezymVar = (ezym) ezyn.a.createBuilder();
                        if ((faimVar.b & 1) != 0) {
                            faik faikVar = faimVar.c;
                            if (faikVar == null) {
                                faikVar = faik.a;
                            }
                            ezyl a2 = efot.a(faikVar);
                            ezymVar.copyOnWrite();
                            ezyn ezynVar = (ezyn) ezymVar.instance;
                            a2.getClass();
                            ezynVar.c = a2;
                            ezynVar.b |= 1;
                        }
                        ezydVar.copyOnWrite();
                        ezyo ezyoVar = (ezyo) ezydVar.instance;
                        ezyn ezynVar2 = (ezyn) ezymVar.build();
                        ezynVar2.getClass();
                        ezyoVar.c = ezynVar2;
                        ezyoVar.b = 2;
                    } else if (i6 == 1) {
                        faid faidVar = i5 == 3 ? (faid) fainVar.c : faid.a;
                        ezye ezyeVar = (ezye) ezyf.a.createBuilder();
                        if (faidVar.b.size() > 0) {
                            Iterator<E> it = faidVar.b.iterator();
                            while (it.hasNext()) {
                                ezyl a3 = efot.a((faik) it.next());
                                ezyeVar.copyOnWrite();
                                ezyf ezyfVar = (ezyf) ezyeVar.instance;
                                a3.getClass();
                                eygr eygrVar4 = ezyfVar.b;
                                if (!eygrVar4.c()) {
                                    ezyfVar.b = eyfy.mutableCopy(eygrVar4);
                                }
                                ezyfVar.b.add(a3);
                            }
                        }
                        ezydVar.copyOnWrite();
                        ezyo ezyoVar2 = (ezyo) ezydVar.instance;
                        ezyf ezyfVar2 = (ezyf) ezyeVar.build();
                        ezyfVar2.getClass();
                        ezyoVar2.c = ezyfVar2;
                        ezyoVar2.b = 3;
                    } else if (i6 == 2) {
                        faih faihVar = i5 == 4 ? (faih) fainVar.c : faih.a;
                        ezyi ezyiVar = (ezyi) ezyj.a.createBuilder();
                        if ((faihVar.b & 1) != 0) {
                            faik faikVar2 = faihVar.c;
                            if (faikVar2 == null) {
                                faikVar2 = faik.a;
                            }
                            ezyl a4 = efot.a(faikVar2);
                            ezyiVar.copyOnWrite();
                            ezyj ezyjVar = (ezyj) ezyiVar.instance;
                            a4.getClass();
                            ezyjVar.c = a4;
                            ezyjVar.b |= 1;
                        }
                        ezydVar.copyOnWrite();
                        ezyo ezyoVar3 = (ezyo) ezydVar.instance;
                        ezyj ezyjVar2 = (ezyj) ezyiVar.build();
                        ezyjVar2.getClass();
                        ezyoVar3.c = ezyjVar2;
                        ezyoVar3.b = 4;
                    } else if (i6 == 3) {
                        ezyg ezygVar = (ezyg) ezyh.a.createBuilder();
                        String str10 = (fainVar.b == 5 ? (faif) fainVar.c : faif.a).b;
                        ezygVar.copyOnWrite();
                        ezyh ezyhVar = (ezyh) ezygVar.instance;
                        str10.getClass();
                        ezyhVar.b = str10;
                        ezydVar.copyOnWrite();
                        ezyo ezyoVar4 = (ezyo) ezydVar.instance;
                        ezyh ezyhVar2 = (ezyh) ezygVar.build();
                        ezyhVar2.getClass();
                        ezyoVar4.c = ezyhVar2;
                        ezyoVar4.b = 5;
                    }
                    ezyaVar.copyOnWrite();
                    ezyv ezyvVar5 = (ezyv) ezyaVar.instance;
                    ezyo ezyoVar5 = (ezyo) ezydVar.build();
                    ezyoVar5.getClass();
                    ezyvVar5.d = ezyoVar5;
                    ezyvVar5.c = 5;
                } else if (i3 == 4) {
                    ezys ezysVar = ezys.a;
                    ezyaVar.copyOnWrite();
                    ezyv ezyvVar6 = (ezyv) ezyaVar.instance;
                    ezysVar.getClass();
                    ezyvVar6.d = ezysVar;
                    ezyvVar6.c = 6;
                }
                faauVar.copyOnWrite();
                faav faavVar = (faav) faauVar.instance;
                ezyv ezyvVar7 = (ezyv) ezyaVar.build();
                ezyvVar7.getClass();
                faavVar.c = ezyvVar7;
                faavVar.b |= 1;
            }
            if ((fagoVar.b & 2) != 0) {
                faaq faaqVar = (faaq) faar.a.createBuilder();
                fakk fakkVar = fagoVar.d;
                if (fakkVar == null) {
                    fakkVar = fakk.a;
                }
                String str11 = fakkVar.b;
                faaqVar.copyOnWrite();
                faar faarVar = (faar) faaqVar.instance;
                str11.getClass();
                faarVar.b = str11;
                fakk fakkVar2 = fagoVar.d;
                if (fakkVar2 == null) {
                    fakkVar2 = fakk.a;
                }
                eyee eyeeVar = fakkVar2.c;
                faaqVar.copyOnWrite();
                faar faarVar2 = (faar) faaqVar.instance;
                eyeeVar.getClass();
                faarVar2.c = eyeeVar;
                faar faarVar3 = (faar) faaqVar.build();
                faauVar.copyOnWrite();
                faav faavVar2 = (faav) faauVar.instance;
                faarVar3.getClass();
                faavVar2.d = faarVar3;
                faavVar2.b |= 2;
            }
            Context context = this.a;
            efos a5 = efos.a();
            ezyw ezywVar = (ezyw) ezyx.a.createBuilder();
            ezywVar.copyOnWrite();
            ezyx ezyxVar = (ezyx) ezywVar.instance;
            faav faavVar3 = (faav) faauVar.build();
            faavVar3.getClass();
            ezyxVar.c = faavVar3;
            ezyxVar.b = 3;
            faax faaxVar = faax.a;
            ezywVar.copyOnWrite();
            ezyx ezyxVar2 = (ezyx) ezywVar.instance;
            faaxVar.getClass();
            ezyxVar2.e = faaxVar;
            ezyxVar2.d = 5;
            a5.b((ezyx) ezywVar.build(), efouVar.b(), efouVar.a(), context, str);
        }
    }

    public final /* synthetic */ void g(fcsl fcslVar, efmw efmwVar) {
        febs febsVar;
        try {
            emby a = a();
            efmu efmuVar = efmu.a;
            boolean z = efmuVar.b;
            efmuVar.b = true;
            fdxk b = b(a);
            efmu.a.b = z;
            if (b == null) {
                Log.e("NetworkCallerGrpc", "Could not get channel for survey startup config.");
                efmu.a.b = false;
                return;
            }
            fcsz a2 = fcta.a(b);
            fdxk fdxkVar = a2.a;
            febs febsVar2 = fcta.e;
            if (febsVar2 == null) {
                synchronized (fcta.class) {
                    febsVar = fcta.e;
                    if (febsVar == null) {
                        febp a3 = febs.a();
                        a3.c = febr.UNARY;
                        a3.d = febs.c("google.internal.feedback.v1.SurveyService", "GetSurveyStartupConfig");
                        a3.b();
                        fcsl fcslVar2 = fcsl.a;
                        eyfc eyfcVar = ffag.a;
                        a3.a = new ffae(fcslVar2);
                        a3.b = new ffae(fcsn.a);
                        febsVar = a3.a();
                        fcta.e = febsVar;
                    }
                }
                febsVar2 = febsVar;
            }
            erqt.r(ffat.a(fdxkVar.a(febsVar2, a2.b), fcslVar), new efny(this, efmwVar), efnp.a());
        } catch (UnsupportedOperationException e) {
            Log.e("NetworkCallerGrpc", "The configured transport is not supported: ".concat(e.toString()));
            i(5);
        }
    }
}
