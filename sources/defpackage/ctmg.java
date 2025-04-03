package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.knowledge.hobbes.chat.common.PredictorResult;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctmg {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/util/p2p/common/SmartSuggestionConfigUtils");
    public final ffbr b;
    public final errl c;
    public final errl d;
    public final errl e;
    public final cqoh f;
    public final Context g;
    private final Map h = new HashMap();
    private final ejlc i;

    public ctmg(Context context, ffbr ffbrVar, errl errlVar, errl errlVar2, errl errlVar3, cqoh cqohVar) {
        this.g = context;
        this.b = ffbrVar;
        this.c = errlVar;
        this.d = errlVar2;
        this.e = errlVar3;
        this.f = cqohVar;
        emys.a(new emyl() { // from class: ctlk
            @Override // defpackage.emyl
            public final Object get() {
                emjm e;
                ctmg ctmgVar = ctmg.this;
                ctmm.a(ctmgVar.f, ctmgVar.g);
                emkp g = ctmgVar.g();
                if (((Boolean) ctmo.q.e()).booleanValue()) {
                    e = ctmgVar.f();
                } else if (((Boolean) ((cfup) ctmo.r.get()).e()).booleanValue()) {
                    emjl emjlVar = (emjl) emjm.a.createBuilder();
                    emjlVar.a(ctmgVar.f().b);
                    emjlVar.a(ctmgVar.e(false).b);
                    e = (emjm) emjlVar.build();
                } else {
                    e = ctmgVar.e(true);
                }
                emle h = ctmgVar.h(e);
                g.copyOnWrite();
                emkq emkqVar = (emkq) g.instance;
                emkq emkqVar2 = emkq.a;
                h.getClass();
                emkqVar.f = h;
                emkqVar.b |= 8;
                return (emkq) g.build();
            }
        });
        this.i = new ejlc(new erog() { // from class: ctll
            @Override // defpackage.erog
            public final ListenableFuture a() {
                final ctmg ctmgVar = ctmg.this;
                return elfo.f(new Runnable() { // from class: ctlv
                    @Override // java.lang.Runnable
                    public final void run() {
                        ctmg ctmgVar2 = ctmg.this;
                        ctmm.a(ctmgVar2.f, ctmgVar2.g);
                    }
                }, ctmgVar.e).i(new eroh() { // from class: ctlw
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        elfl b;
                        boolean booleanValue = ((Boolean) ctmo.q.e()).booleanValue();
                        final ctmg ctmgVar2 = ctmg.this;
                        if (booleanValue) {
                            b = ctmgVar2.c();
                        } else if (((Boolean) ((cfup) ctmo.r.get()).e()).booleanValue()) {
                            final elfl c = ctmgVar2.c();
                            final elfl b2 = ctmgVar2.b(false);
                            b = elfo.k(c, b2).a(new Callable() { // from class: ctln
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    emjl emjlVar = (emjl) emjm.a.createBuilder();
                                    emjlVar.a(((emjm) erqt.q(elfl.this)).b);
                                    emjlVar.a(((emjm) erqt.q(b2)).b);
                                    return (emjm) emjlVar.build();
                                }
                            }, ctmgVar2.d);
                        } else {
                            b = ctmgVar2.b(true);
                        }
                        return b.h(new emwl() { // from class: ctlo
                            @Override // defpackage.emwl
                            public final Object apply(Object obj2) {
                                return ctmg.this.h((emjm) obj2);
                            }
                        }, ctmgVar2.c).h(new emwl() { // from class: ctma
                            @Override // defpackage.emwl
                            public final Object apply(Object obj2) {
                                emle emleVar = (emle) obj2;
                                emkp g = ctmg.this.g();
                                g.copyOnWrite();
                                emkq emkqVar = (emkq) g.instance;
                                emkq emkqVar2 = emkq.a;
                                emleVar.getClass();
                                emkqVar.f = emleVar;
                                emkqVar.b |= 8;
                                return (emkq) g.build();
                            }
                        }, ctmgVar2.c);
                    }
                }, ctmgVar.d);
            }
        }, errlVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static emhv d(String str) {
        if (TextUtils.isEmpty(str)) {
            return emhv.a;
        }
        engw j = j(str);
        return j.isEmpty() ? emhv.a : (emhv) j.get(0);
    }

    public static engw j(String str) {
        emye a2 = emye.b(':').f().a();
        int i = engw.d;
        engr engrVar = new engr();
        for (String str2 : emye.b(',').f().a().g(str)) {
            if (!str2.isEmpty()) {
                List i2 = a2.i(str2);
                if (i2.size() == 2) {
                    emhu emhuVar = (emhu) emhv.a.createBuilder();
                    emhw emhwVar = (emhw) emhx.a.createBuilder();
                    String str3 = (String) i2.get(0);
                    emhwVar.copyOnWrite();
                    emhx emhxVar = (emhx) emhwVar.instance;
                    str3.getClass();
                    emhxVar.b |= 1;
                    emhxVar.c = str3;
                    String str4 = (String) i2.get(1);
                    emhwVar.copyOnWrite();
                    emhx emhxVar2 = (emhx) emhwVar.instance;
                    str4.getClass();
                    emhxVar2.b = 2 | emhxVar2.b;
                    emhxVar2.d = str4;
                    emhuVar.copyOnWrite();
                    emhv emhvVar = (emhv) emhuVar.instance;
                    emhx emhxVar3 = (emhx) emhwVar.build();
                    emhxVar3.getClass();
                    emhvVar.c = emhxVar3;
                    emhvVar.b |= 1;
                    engrVar.h((emhv) emhuVar.build());
                } else {
                    if (i2.size() != 1) {
                        throw new IllegalArgumentException(String.format("Could not build file-specs from string: %s", str));
                    }
                    emhu emhuVar2 = (emhu) emhv.a.createBuilder();
                    String str5 = (String) i2.get(0);
                    emhuVar2.copyOnWrite();
                    emhv emhvVar2 = (emhv) emhuVar2.instance;
                    str5.getClass();
                    emhvVar2.b = 2 | emhvVar2.b;
                    emhvVar2.d = str5;
                    engrVar.h((emhv) emhuVar2.build());
                }
            }
        }
        return engrVar.g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final elfl m() {
        elfl e;
        if (((Boolean) ctjd.k.e()).booleanValue() && (TextUtils.isEmpty((CharSequence) ctjd.o.e()) || TextUtils.isEmpty((CharSequence) ctjd.p.e()))) {
            return elfo.e(Optional.empty());
        }
        if (TextUtils.isEmpty((CharSequence) ctmo.l.e())) {
            e = elfo.e(Optional.empty());
        } else {
            final engw j = j((String) ctmo.l.e());
            if (((enou) j).c != 1) {
                ensk j2 = a.j();
                j2.Y(ente.a, "Bugle");
                ((enrr) ((enrr) j2).h("com/google/android/apps/messaging/shared/util/p2p/common/SmartSuggestionConfigUtils", "maybeGetDownloadedLinguaModelConfigAsync", 1155, "SmartSuggestionConfigUtils.java")).t("Bad file-spec flag for in-apk multi-task config: %s", ctmo.l.e());
                e = elfo.e(Optional.empty());
            } else {
                e = new elfj(((emmt) this.b.b()).c((emhv) j.get(0))).f(new erow() { // from class: ctmb
                    @Override // defpackage.erow
                    public final Object a(erpc erpcVar, Object obj) {
                        return ctmg.this.k((InputStream) obj, j);
                    }
                }, this.d).h().e(FileNotFoundException.class, new emwl() { // from class: ctmc
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        ensk j3 = ctmg.a.j();
                        j3.Y(ente.a, "Bugle");
                        ((enrr) ((enrr) ((enrr) j3).g((FileNotFoundException) obj)).h("com/google/android/apps/messaging/shared/util/p2p/common/SmartSuggestionConfigUtils", "maybeGetDownloadedLinguaModelConfigAsync", 1169, "SmartSuggestionConfigUtils.java")).t("Could not find file: %s", emms.b((emhv) engw.this.get(0)));
                        return Optional.empty();
                    }
                }, this.d).e(IOException.class, new emwl() { // from class: ctmd
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        ensk j3 = ctmg.a.j();
                        j3.Y(ente.a, "Bugle");
                        ((enrr) ((enrr) ((enrr) j3).g((IOException) obj)).h("com/google/android/apps/messaging/shared/util/p2p/common/SmartSuggestionConfigUtils", "maybeGetDownloadedLinguaModelConfigAsync", 1178, "SmartSuggestionConfigUtils.java")).t("Error reading FileSpec: %s", emms.b((emhv) engw.this.get(0)));
                        return Optional.empty();
                    }
                }, this.d);
            }
        }
        return e.h(new emwl() { // from class: ctlp
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return ctmg.this.l((Optional) obj);
            }
        }, this.c);
    }

    private static emhv n(String str, String str2, Optional optional) {
        emhu emhuVar = (emhu) emhv.a.createBuilder();
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            emhw emhwVar = (emhw) emhx.a.createBuilder();
            emhwVar.copyOnWrite();
            emhx emhxVar = (emhx) emhwVar.instance;
            str.getClass();
            emhxVar.b |= 1;
            emhxVar.c = str;
            emhwVar.copyOnWrite();
            emhx emhxVar2 = (emhx) emhwVar.instance;
            str2.getClass();
            emhxVar2.b |= 2;
            emhxVar2.d = str2;
            emhuVar.copyOnWrite();
            emhv emhvVar = (emhv) emhuVar.instance;
            emhx emhxVar3 = (emhx) emhwVar.build();
            emhxVar3.getClass();
            emhvVar.c = emhxVar3;
            emhvVar.b |= 1;
        }
        if (optional.isPresent()) {
            Object obj = optional.get();
            emhuVar.copyOnWrite();
            emhv emhvVar2 = (emhv) emhuVar.instance;
            emhvVar2.b |= 2;
            emhvVar2.d = (String) obj;
        }
        return (emhv) emhuVar.build();
    }

    private static emiy o(String str, double d) {
        emiy emiyVar = (emiy) emiz.a.createBuilder();
        emiyVar.copyOnWrite();
        emiz emizVar = (emiz) emiyVar.instance;
        emizVar.b |= 1;
        emizVar.e = str;
        emiyVar.copyOnWrite();
        emiz emizVar2 = (emiz) emiyVar.instance;
        emizVar2.c = 3;
        emizVar2.d = Float.valueOf((float) d);
        return emiyVar;
    }

    private static emja p(String str, int i) {
        emja emjaVar = (emja) emjb.a.createBuilder();
        emjaVar.copyOnWrite();
        emjb emjbVar = (emjb) emjaVar.instance;
        emjbVar.b |= 1;
        emjbVar.c = str;
        emjaVar.copyOnWrite();
        emjb emjbVar2 = (emjb) emjaVar.instance;
        emjbVar2.b |= 2;
        emjbVar2.d = i;
        return emjaVar;
    }

    private static engy q(String str) {
        emye a2 = emye.b('|').f().a();
        emye a3 = emye.b(':').f().a();
        engx engxVar = new engx();
        for (String str2 : emye.b(',').f().a().g(str)) {
            if (!str2.isEmpty()) {
                List i = a2.i(str2);
                if (i.size() != 2) {
                    throw new IllegalArgumentException(String.format("Could not build file-specs from string: %s", str));
                }
                String str3 = (String) i.get(0);
                String str4 = (String) i.get(1);
                List i2 = a3.i(str3);
                if (i2.size() == 2) {
                    emhu emhuVar = (emhu) emhv.a.createBuilder();
                    emhw emhwVar = (emhw) emhx.a.createBuilder();
                    String str5 = (String) i2.get(0);
                    emhwVar.copyOnWrite();
                    emhx emhxVar = (emhx) emhwVar.instance;
                    str5.getClass();
                    emhxVar.b |= 1;
                    emhxVar.c = str5;
                    String str6 = (String) i2.get(1);
                    emhwVar.copyOnWrite();
                    emhx emhxVar2 = (emhx) emhwVar.instance;
                    str6.getClass();
                    emhxVar2.b = 2 | emhxVar2.b;
                    emhxVar2.d = str6;
                    emhuVar.copyOnWrite();
                    emhv emhvVar = (emhv) emhuVar.instance;
                    emhx emhxVar3 = (emhx) emhwVar.build();
                    emhxVar3.getClass();
                    emhvVar.c = emhxVar3;
                    emhvVar.b |= 1;
                    engxVar.b(str4, (emhv) emhuVar.build());
                } else {
                    if (i2.size() != 1) {
                        throw new IllegalArgumentException(String.format("Could not build file-specs from string: %s because of invalid non-role: %s", str, str3));
                    }
                    emhu emhuVar2 = (emhu) emhv.a.createBuilder();
                    String str7 = (String) i.get(0);
                    emhuVar2.copyOnWrite();
                    emhv emhvVar2 = (emhv) emhuVar2.instance;
                    str7.getClass();
                    emhvVar2.b = 2 | emhvVar2.b;
                    emhvVar2.d = str7;
                    engxVar.b(str4, (emhv) emhuVar2.build());
                }
            }
        }
        return engxVar.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    private final Optional r() {
        Optional empty;
        if (((Boolean) ctjd.k.e()).booleanValue() && (TextUtils.isEmpty((CharSequence) ctjd.o.e()) || TextUtils.isEmpty((CharSequence) ctjd.p.e()))) {
            return Optional.empty();
        }
        if (TextUtils.isEmpty((CharSequence) ctmo.l.e())) {
            empty = Optional.empty();
        } else {
            engw j = j((String) ctmo.l.e());
            if (((enou) j).c != 1) {
                ensk j2 = a.j();
                j2.Y(ente.a, "Bugle");
                ((enrr) ((enrr) j2).h("com/google/android/apps/messaging/shared/util/p2p/common/SmartSuggestionConfigUtils", "maybeGetDownloadedLinguaModelConfig", 1120, "SmartSuggestionConfigUtils.java")).t("Bad file-spec flag for in-apk multi-task config: %s", ctmo.l.e());
                empty = Optional.empty();
            } else {
                try {
                    InputStream f = ((emmt) this.b.b()).f((emhv) j.get(0));
                    try {
                        Optional k = k(f, j);
                        if (f != null) {
                            f.close();
                        }
                        empty = k;
                    } catch (Throwable th) {
                        if (f != null) {
                            try {
                                f.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (FileNotFoundException e) {
                    ensk j3 = a.j();
                    j3.Y(ente.a, "Bugle");
                    ((enrr) ((enrr) ((enrr) j3).g(e)).h("com/google/android/apps/messaging/shared/util/p2p/common/SmartSuggestionConfigUtils", "maybeGetDownloadedLinguaModelConfig", 1128, "SmartSuggestionConfigUtils.java")).t("Could not find file: %s", emms.b((emhv) j.get(0)));
                    empty = Optional.empty();
                } catch (IOException e2) {
                    ensk j4 = a.j();
                    j4.Y(ente.a, "Bugle");
                    ((enrr) ((enrr) ((enrr) j4).g(e2)).h("com/google/android/apps/messaging/shared/util/p2p/common/SmartSuggestionConfigUtils", "maybeGetDownloadedLinguaModelConfig", 1132, "SmartSuggestionConfigUtils.java")).t("Error reading FileSpec: %s", emms.b((emhv) j.get(0)));
                    empty = Optional.empty();
                }
            }
        }
        return l(empty);
    }

    private final String s(String str) {
        InputStream inputStream;
        Exception e;
        File file;
        FileOutputStream fileOutputStream;
        File cacheDir = this.g.getCacheDir();
        String concat = "smarts_cache_item_".concat(str);
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                if (this.h.containsKey(str) && ((File) this.h.get(str)).exists()) {
                    return ((File) this.h.get(str)).getAbsolutePath();
                }
                inputStream = this.g.getResources().openRawResource(this.g.getResources().getIdentifier(str, "raw", this.g.getPackageName()));
                try {
                    file = new File(cacheDir, concat);
                    if (file.exists() && file.length() > 0) {
                        if (inputStream.available() == file.length()) {
                            this.h.put(str, file);
                            try {
                                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                                long length = randomAccessFile.length();
                                randomAccessFile.setLength(1 + length);
                                randomAccessFile.setLength(length);
                                randomAccessFile.close();
                            } catch (IOException unused) {
                            }
                            String absolutePath = file.getAbsolutePath();
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (IOException unused2) {
                                }
                            }
                            return absolutePath;
                        }
                        if (file.delete()) {
                            file = new File(cacheDir, concat);
                        }
                    }
                    fileOutputStream = new FileOutputStream(file);
                } catch (Exception e2) {
                    e = e2;
                }
                try {
                    eoej.a(inputStream, fileOutputStream);
                    inputStream.close();
                    fileOutputStream.close();
                    this.h.put(str, file);
                    String absolutePath2 = file.getAbsolutePath();
                    try {
                        fileOutputStream.close();
                        if (inputStream != null) {
                            inputStream.close();
                        }
                    } catch (IOException unused3) {
                    }
                    return absolutePath2;
                } catch (Exception e3) {
                    e = e3;
                    fileOutputStream2 = fileOutputStream;
                    ensk i = a.i();
                    i.Y(ente.a, "Bugle");
                    ((enrr) ((enrr) ((enrr) i).g(e)).h("com/google/android/apps/messaging/shared/util/p2p/common/SmartSuggestionConfigUtils", "getFileFromResources", 1345, "SmartSuggestionConfigUtils.java")).t("SmartSuggestionConfigUtils: Error reading %s", str);
                    if (fileOutputStream2 != null) {
                        try {
                            fileOutputStream2.close();
                        } catch (IOException unused4) {
                            return "";
                        }
                    }
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    return "";
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream2 = fileOutputStream;
                    if (fileOutputStream2 != null) {
                        try {
                            fileOutputStream2.close();
                        } catch (IOException unused5) {
                            throw th;
                        }
                    }
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e4) {
            e = e4;
            inputStream = null;
        } catch (Throwable th3) {
            th = th3;
            inputStream = null;
        }
    }

    private final String t() {
        return s("multi_lite_9head_20200301_model");
    }

    private static final emkm u() {
        emkm emkmVar = (emkm) emko.a.createBuilder();
        int intValue = ((Integer) ctiv.a.e()).intValue();
        emkmVar.copyOnWrite();
        emko emkoVar = (emko) emkmVar.instance;
        emkoVar.b |= 1;
        emkoVar.e = intValue;
        return emkmVar;
    }

    private final Optional v(int i) {
        return !Locale.ENGLISH.getLanguage().equals(ctid.c(this.g).getLanguage()) ? Optional.empty() : i == 3 ? Optional.of(s("sensitive_classifier_20191012")) : Optional.of(s("sensitive_classifier_20171221_whitelisted_v2"));
    }

    public final elfl a() {
        return elfl.g(this.i.c());
    }

    public final elfl b(boolean z) {
        final emjl emjlVar = (emjl) emjm.a.createBuilder();
        return (z ? m() : elfo.e(Optional.empty())).i(new eroh() { // from class: ctlt
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final emjl emjlVar2 = emjlVar;
                emjlVar2.getClass();
                ((Optional) obj).ifPresent(new ctme(emjlVar2));
                engw j = ctmg.j((String) ctjd.L.e());
                final ArrayList arrayList = new ArrayList();
                int i = ((enou) j).c;
                int i2 = 0;
                while (true) {
                    ctmg ctmgVar = ctmg.this;
                    if (i2 >= i) {
                        return elfo.j(arrayList).a(new Callable() { // from class: ctmf
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                Iterator it = arrayList.iterator();
                                while (true) {
                                    emjl emjlVar3 = emjlVar2;
                                    if (!it.hasNext()) {
                                        return (emjm) emjlVar3.build();
                                    }
                                    Iterator it2 = ((List) erqt.q((elfl) it.next())).iterator();
                                    while (it2.hasNext()) {
                                        emjlVar3.b((emjk) it2.next());
                                    }
                                }
                            }
                        }, ctmgVar.d);
                    }
                    final emhv emhvVar = (emhv) j.get(i2);
                    arrayList.add(new elfj(((emmt) ctmgVar.b.b()).c(emhvVar)).g(new erot() { // from class: ctlq
                        @Override // defpackage.erot
                        public final erph a(erpc erpcVar, Object obj2) {
                            InputStream inputStream = (InputStream) obj2;
                            if (inputStream != null) {
                                return new erph(elfo.e(((emjm) eyfy.parseFrom(emjm.a, inputStream, eyfc.a())).b));
                            }
                            emhv emhvVar2 = emhv.this;
                            ensk j2 = ctmg.a.j();
                            j2.Y(ente.a, "Bugle");
                            ((enrr) ((enrr) j2).h("com/google/android/apps/messaging/shared/util/p2p/common/SmartSuggestionConfigUtils", "readModelBasedProviderConfigsFromFile", 617, "SmartSuggestionConfigUtils.java")).t("Null fileInputStream for file: %s", emms.b(emhvVar2));
                            int i3 = engw.d;
                            return new erph(elfo.e(enou.a));
                        }
                    }, ctmgVar.c).h().e(FileNotFoundException.class, new emwl() { // from class: ctlr
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            ensk j2 = ctmg.a.j();
                            j2.Y(ente.a, "Bugle");
                            ((enrr) ((enrr) ((enrr) j2).g((FileNotFoundException) obj2)).h("com/google/android/apps/messaging/shared/util/p2p/common/SmartSuggestionConfigUtils", "readModelBasedProviderConfigsFromFile", 637, "SmartSuggestionConfigUtils.java")).t("Could not find file: %s", emms.b(emhv.this));
                            int i3 = engw.d;
                            return enou.a;
                        }
                    }, ctmgVar.d).e(IOException.class, new emwl() { // from class: ctls
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            ensk j2 = ctmg.a.j();
                            j2.Y(ente.a, "Bugle");
                            ((enrr) ((enrr) ((enrr) j2).g((IOException) obj2)).h("com/google/android/apps/messaging/shared/util/p2p/common/SmartSuggestionConfigUtils", "readModelBasedProviderConfigsFromFile", 646, "SmartSuggestionConfigUtils.java")).t("Error reading FileSpec: %s", emms.b(emhv.this));
                            int i3 = engw.d;
                            return enou.a;
                        }
                    }, ctmgVar.d));
                    i2++;
                }
            }
        }, this.d);
    }

    public final elfl c() {
        final engy q = q((String) ctmo.p.e());
        return m().h(new emwl() { // from class: ctlx
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return ctmg.this.i((Optional) obj, q);
            }
        }, this.d).h(new emwl() { // from class: ctlz
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                emjl emjlVar = (emjl) emjm.a.createBuilder();
                emjlVar.a((engw) obj);
                return (emjm) emjlVar.build();
            }
        }, this.d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public final emjm e(boolean z) {
        emjl emjlVar = (emjl) emjm.a.createBuilder();
        if (z) {
            Optional r = r();
            emjlVar.getClass();
            r.ifPresent(new ctme(emjlVar));
        }
        engw j = j((String) ctjd.L.e());
        int i = ((enou) j).c;
        for (int i2 = 0; i2 < i; i2++) {
            emhv emhvVar = (emhv) j.get(i2);
            try {
                InputStream f = ((emmt) this.b.b()).f(emhvVar);
                try {
                    emjlVar.a(((emjm) eyfy.parseFrom(emjm.a, f, eyfc.a())).b);
                    if (f != null) {
                        f.close();
                    }
                } catch (Throwable th) {
                    if (f != null) {
                        try {
                            f.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (FileNotFoundException e) {
                ensk j2 = a.j();
                j2.Y(ente.a, "Bugle");
                ((enrr) ((enrr) ((enrr) j2).g(e)).h("com/google/android/apps/messaging/shared/util/p2p/common/SmartSuggestionConfigUtils", "maybeGetModelBasedProviders", 542, "SmartSuggestionConfigUtils.java")).t("Could not find file: %s", emms.b(emhvVar));
            } catch (IOException e2) {
                ensk j3 = a.j();
                j3.Y(ente.a, "Bugle");
                ((enrr) ((enrr) ((enrr) j3).g(e2)).h("com/google/android/apps/messaging/shared/util/p2p/common/SmartSuggestionConfigUtils", "maybeGetModelBasedProviders", 545, "SmartSuggestionConfigUtils.java")).t("Error reading FileSpec: %s", emms.b(emhvVar));
            }
        }
        return (emjm) emjlVar.build();
    }

    @Deprecated
    public final emjm f() {
        engy q = q((String) ctmo.p.e());
        emjl emjlVar = (emjl) emjm.a.createBuilder();
        emjlVar.a(i(r(), q));
        return (emjm) emjlVar.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final emkp g() {
        emko emkoVar;
        Optional of;
        emkp emkpVar = (emkp) emkq.a.createBuilder();
        emiv emivVar = (emiv) emiw.a.createBuilder();
        float floatValue = ((Double) ctjd.l.e()).floatValue();
        emivVar.copyOnWrite();
        emiw emiwVar = (emiw) emivVar.instance;
        emiwVar.b |= 1;
        emiwVar.c = floatValue;
        List e = cuxt.e((String) ctjd.s.e());
        emivVar.copyOnWrite();
        emiw emiwVar2 = (emiw) emivVar.instance;
        eygr eygrVar = emiwVar2.d;
        if (!eygrVar.c()) {
            emiwVar2.d = eyfy.mutableCopy(eygrVar);
        }
        eydl.addAll(e, emiwVar2.d);
        emiw emiwVar3 = (emiw) emivVar.build();
        emkpVar.copyOnWrite();
        emkq emkqVar = (emkq) emkpVar.instance;
        emiwVar3.getClass();
        emkqVar.c = emiwVar3;
        emkqVar.b |= 1;
        if (((Boolean) ctiv.d.e()).booleanValue()) {
            emkm u = u();
            emix emixVar = (emix) emjc.a.createBuilder();
            emhv n = n((String) ctiv.b.e(), (String) ctiv.c.e(), v(3));
            emixVar.copyOnWrite();
            emjc emjcVar = (emjc) emixVar.instance;
            n.getClass();
            emjcVar.c = n;
            emjcVar.b |= 1;
            emja emjaVar = (emja) emjb.a.createBuilder();
            emjaVar.copyOnWrite();
            emjb emjbVar = (emjb) emjaVar.instance;
            emjbVar.b |= 1;
            emjbVar.c = PredictorResult.Types.REPLY_SUGGESTION;
            emjaVar.copyOnWrite();
            emjb emjbVar2 = (emjb) emjaVar.instance;
            emjbVar2.b |= 2;
            emjbVar2.d = 2;
            emjaVar.copyOnWrite();
            emjb emjbVar3 = (emjb) emjaVar.instance;
            emjbVar3.b |= 4;
            emjbVar3.e = 0.5d;
            emixVar.b(emjaVar);
            emixVar.copyOnWrite();
            emjc emjcVar2 = (emjc) emixVar.instance;
            emjcVar2.g = 2;
            emjcVar2.b |= 4;
            u.copyOnWrite();
            emko emkoVar2 = (emko) u.instance;
            emjc emjcVar3 = (emjc) emixVar.build();
            emko emkoVar3 = emko.a;
            emjcVar3.getClass();
            emkoVar2.d = emjcVar3;
            emkoVar2.c = 3;
            emkoVar = (emko) u.build();
        } else {
            emkm u2 = u();
            emhv n2 = n((String) ctiv.b.e(), (String) ctiv.c.e(), v(2));
            u2.copyOnWrite();
            emko emkoVar4 = (emko) u2.instance;
            emko emkoVar5 = emko.a;
            n2.getClass();
            emkoVar4.d = n2;
            emkoVar4.c = 2;
            emkoVar = (emko) u2.build();
        }
        emkpVar.copyOnWrite();
        emkq emkqVar2 = (emkq) emkpVar.instance;
        emkoVar.getClass();
        emkqVar2.d = emkoVar;
        emkqVar2.b |= 2;
        emlb emlbVar = (emlb) emlc.a.createBuilder();
        String str = (String) ctjd.g.e();
        if (!TextUtils.isEmpty(str)) {
            List i = emye.b(',').i(str);
            emlbVar.copyOnWrite();
            emlc emlcVar = (emlc) emlbVar.instance;
            eygr eygrVar2 = emlcVar.b;
            if (!eygrVar2.c()) {
                emlcVar.b = eyfy.mutableCopy(eygrVar2);
            }
            eydl.addAll(i, emlcVar.b);
        }
        String str2 = (String) ctjd.h.e();
        if (!TextUtils.isEmpty(str2)) {
            List i2 = emye.b(',').i(str2);
            emlbVar.copyOnWrite();
            emlc emlcVar2 = (emlc) emlbVar.instance;
            eygr eygrVar3 = emlcVar2.c;
            if (!eygrVar3.c()) {
                emlcVar2.c = eyfy.mutableCopy(eygrVar3);
            }
            eydl.addAll(i2, emlcVar2.c);
        }
        String str3 = (String) ctjd.i.e();
        if (!TextUtils.isEmpty(str3)) {
            List i3 = emye.b(',').i(str3);
            emlbVar.copyOnWrite();
            emlc emlcVar3 = (emlc) emlbVar.instance;
            eygr eygrVar4 = emlcVar3.d;
            if (!eygrVar4.c()) {
                emlcVar3.d = eyfy.mutableCopy(eygrVar4);
            }
            eydl.addAll(i3, emlcVar3.d);
        }
        String str4 = (String) ctjd.j.e();
        if (!TextUtils.isEmpty(str4)) {
            List i4 = emye.b(',').i(str4);
            emlbVar.copyOnWrite();
            emlc emlcVar4 = (emlc) emlbVar.instance;
            eygr eygrVar5 = emlcVar4.e;
            if (!eygrVar5.c()) {
                emlcVar4.e = eyfy.mutableCopy(eygrVar5);
            }
            eydl.addAll(i4, emlcVar4.e);
        }
        emlc emlcVar5 = (emlc) emlbVar.build();
        emkpVar.copyOnWrite();
        emkq emkqVar3 = (emkq) emkpVar.instance;
        emlcVar5.getClass();
        emkqVar3.e = emlcVar5;
        emkqVar3.b |= 4;
        emhv d = d((String) ctjd.z.e());
        emkpVar.copyOnWrite();
        emkq emkqVar4 = (emkq) emkpVar.instance;
        d.getClass();
        emkqVar4.g = d;
        emkqVar4.b |= 16;
        boolean booleanValue = ((Boolean) ctjd.f.e()).booleanValue();
        emkpVar.copyOnWrite();
        emkq emkqVar5 = (emkq) emkpVar.instance;
        emkqVar5.b |= 64;
        emkqVar5.h = booleanValue;
        final emjq emjqVar = (emjq) emkd.b.createBuilder();
        emjqVar.a(fbri.SPAM);
        emjqVar.a(fbri.SILENT);
        emjqVar.a(fbri.BUSINESS_MESSAGE);
        emjqVar.a(fbri.CALENDAR);
        emkf emkfVar = emkf.a;
        emjqVar.copyOnWrite();
        emkd emkdVar = (emkd) emjqVar.instance;
        emkfVar.getClass();
        emkdVar.g = emkfVar;
        emkdVar.c |= 2;
        if (((Boolean) ctiv.e.e()).booleanValue()) {
            emjqVar.a(fbri.STARRING);
        }
        if (((Boolean) ctmo.b.e()).booleanValue()) {
            if (((Boolean) ctmo.b.e()).booleanValue()) {
                try {
                    engw j = j((String) ctmo.c.e());
                    if (((enou) j).c != 1) {
                        ensk j2 = a.j();
                        j2.Y(ente.a, "Bugle");
                        ((enrr) ((enrr) j2).h("com/google/android/apps/messaging/shared/util/p2p/common/SmartSuggestionConfigUtils", "maybeGetModelBasedRerankerConfig", 383, "SmartSuggestionConfigUtils.java")).t("Found more than one flag for model based reranker config: %s", ctmo.c.e());
                        of = Optional.empty();
                    } else {
                        emjv emjvVar = (emjv) emkc.b.createBuilder();
                        eygk eygkVar = new eygk(((ctli) eyfy.parseFrom(ctli.b, (byte[]) ctmo.v.e(), eyfc.a())).c, ctli.a);
                        emjvVar.copyOnWrite();
                        emkc emkcVar = (emkc) emjvVar.instance;
                        eygi eygiVar = emkcVar.m;
                        if (!eygiVar.c()) {
                            emkcVar.m = eyfy.mutableCopy(eygiVar);
                        }
                        Iterator<E> it = eygkVar.iterator();
                        while (it.hasNext()) {
                            emkcVar.m.h(((fbri) it.next()).a());
                        }
                        emhv emhvVar = (emhv) j.get(0);
                        emjvVar.copyOnWrite();
                        emkc emkcVar2 = (emkc) emjvVar.instance;
                        emkcVar2.d = emhvVar;
                        emkcVar2.c |= 1;
                        int intValue = ((Integer) ctmo.e.e()).intValue();
                        emjvVar.copyOnWrite();
                        emkc emkcVar3 = (emkc) emjvVar.instance;
                        emkcVar3.c |= 2;
                        emkcVar3.e = intValue;
                        int a2 = emjz.a(((Integer) ctmo.f.e()).intValue());
                        emjvVar.copyOnWrite();
                        emkc emkcVar4 = (emkc) emjvVar.instance;
                        int i5 = a2 - 1;
                        if (a2 == 0) {
                            throw null;
                        }
                        emkcVar4.f = i5;
                        emkcVar4.c |= 4;
                        float floatValue2 = ((Double) ctmo.g.e()).floatValue();
                        emjvVar.copyOnWrite();
                        emkc emkcVar5 = (emkc) emjvVar.instance;
                        emkcVar5.c |= 8;
                        emkcVar5.g = floatValue2;
                        boolean booleanValue2 = ((Boolean) ctmo.h.e()).booleanValue();
                        emjvVar.copyOnWrite();
                        emkc emkcVar6 = (emkc) emjvVar.instance;
                        emkcVar6.c |= 16;
                        emkcVar6.h = booleanValue2;
                        boolean booleanValue3 = ((Boolean) ctmo.i.e()).booleanValue();
                        emjvVar.copyOnWrite();
                        emkc emkcVar7 = (emkc) emjvVar.instance;
                        emkcVar7.c |= 32;
                        emkcVar7.i = booleanValue3;
                        int intValue2 = ((Integer) ctmo.j.e()).intValue();
                        emjvVar.copyOnWrite();
                        emkc emkcVar8 = (emkc) emjvVar.instance;
                        emkcVar8.c |= 64;
                        emkcVar8.j = intValue2;
                        int a3 = emkb.a(((Integer) ctmo.k.e()).intValue());
                        emjvVar.copyOnWrite();
                        emkc emkcVar9 = (emkc) emjvVar.instance;
                        int i6 = a3 - 1;
                        if (a3 == 0) {
                            throw null;
                        }
                        emkcVar9.k = i6;
                        emkcVar9.c |= 128;
                        int a4 = emjx.a(((Integer) ctmo.d.e()).intValue());
                        emjvVar.copyOnWrite();
                        emkc emkcVar10 = (emkc) emjvVar.instance;
                        int i7 = a4 - 1;
                        if (a4 == 0) {
                            throw null;
                        }
                        emkcVar10.l = i7;
                        emkcVar10.c |= 256;
                        of = Optional.of((emkc) emjvVar.build());
                    }
                } catch (eygu e2) {
                    ensk i8 = a.i();
                    i8.Y(ente.a, "Bugle");
                    ((enrr) ((enrr) ((enrr) i8).g(e2)).h("com/google/android/apps/messaging/shared/util/p2p/common/SmartSuggestionConfigUtils", "maybeGetModelBasedRerankerConfig", (char) 409, "SmartSuggestionConfigUtils.java")).q("Could not parse the Reranker Exempt Types list from the Phenotype flag.");
                } catch (IllegalArgumentException unused) {
                    ensk j3 = a.j();
                    j3.Y(ente.a, "Bugle");
                    ((enrr) ((enrr) j3).h("com/google/android/apps/messaging/shared/util/p2p/common/SmartSuggestionConfigUtils", "maybeGetModelBasedRerankerConfig", 412, "SmartSuggestionConfigUtils.java")).t("Bad file-spec flag for model based reranker config: %s", ctmo.c.e());
                }
                of.ifPresent(new Consumer() { // from class: ctlj
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        emjq emjqVar2 = emjq.this;
                        emkc emkcVar11 = (emkc) obj;
                        emjqVar2.copyOnWrite();
                        emkd emkdVar2 = (emkd) emjqVar2.instance;
                        eygj eygjVar = emkd.a;
                        emkcVar11.getClass();
                        emkdVar2.e = emkcVar11;
                        emkdVar2.d = 2;
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
            of = Optional.empty();
            of.ifPresent(new Consumer() { // from class: ctlj
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    emjq emjqVar2 = emjq.this;
                    emkc emkcVar11 = (emkc) obj;
                    emjqVar2.copyOnWrite();
                    emkd emkdVar2 = (emkd) emjqVar2.instance;
                    eygj eygjVar = emkd.a;
                    emkcVar11.getClass();
                    emkdVar2.e = emkcVar11;
                    emkdVar2.d = 2;
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        } else {
            emjs emjsVar = emjs.a;
            emjqVar.copyOnWrite();
            emkd emkdVar2 = (emkd) emjqVar.instance;
            emjsVar.getClass();
            emkdVar2.e = emjsVar;
            emkdVar2.d = 1;
        }
        emkd emkdVar3 = (emkd) emjqVar.build();
        emkpVar.copyOnWrite();
        emkq emkqVar6 = (emkq) emkpVar.instance;
        emkdVar3.getClass();
        emkqVar6.i = emkdVar3;
        emkqVar6.b |= 128;
        emku emkuVar = emku.a;
        emkpVar.copyOnWrite();
        emkq emkqVar7 = (emkq) emkpVar.instance;
        emkuVar.getClass();
        emkqVar7.j = emkuVar;
        emkqVar7.b |= 256;
        emkr emkrVar = (emkr) emks.a.createBuilder();
        boolean booleanValue4 = ((Boolean) ((cfup) ctmo.t.get()).e()).booleanValue();
        emkrVar.copyOnWrite();
        emks emksVar = (emks) emkrVar.instance;
        emksVar.b |= 1;
        emksVar.c = booleanValue4;
        boolean booleanValue5 = ((Boolean) ((cfup) ctmo.u.get()).e()).booleanValue();
        emkrVar.copyOnWrite();
        emks emksVar2 = (emks) emkrVar.instance;
        emksVar2.b |= 2;
        emksVar2.d = booleanValue5;
        emkrVar.copyOnWrite();
        emks emksVar3 = (emks) emkrVar.instance;
        emksVar3.b |= 4;
        emksVar3.e = false;
        emkpVar.copyOnWrite();
        emkq emkqVar8 = (emkq) emkpVar.instance;
        emks emksVar4 = (emks) emkrVar.build();
        emksVar4.getClass();
        emkqVar8.k = emksVar4;
        emkqVar8.b |= 512;
        return emkpVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final emle h(emjm emjmVar) {
        Optional empty;
        Optional empty2;
        final emld emldVar = (emld) emle.a.createBuilder();
        if (emjmVar.b.size() > 0) {
            emldVar.copyOnWrite();
            emle emleVar = (emle) emldVar.instance;
            emjmVar.getClass();
            emleVar.d = emjmVar;
            emleVar.b |= 2;
        }
        engw j = j((String) ctjd.K.e());
        emldVar.copyOnWrite();
        emle emleVar2 = (emle) emldVar.instance;
        eygr eygrVar = emleVar2.f;
        if (!eygrVar.c()) {
            emleVar2.f = eyfy.mutableCopy(eygrVar);
        }
        eydl.addAll(j, emleVar2.f);
        if (((Integer) ctjd.v.e()).intValue() > 0) {
            emkz emkzVar = (emkz) emla.a.createBuilder();
            int intValue = ((Integer) ctjd.v.e()).intValue();
            emkzVar.copyOnWrite();
            emla emlaVar = (emla) emkzVar.instance;
            emlaVar.b |= 1;
            emlaVar.c = intValue;
            empty = Optional.of((emla) emkzVar.build());
        } else {
            empty = Optional.empty();
        }
        emldVar.getClass();
        empty.ifPresent(new Consumer() { // from class: ctlu
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                emld emldVar2 = emld.this;
                emla emlaVar2 = (emla) obj;
                emldVar2.copyOnWrite();
                emle emleVar3 = (emle) emldVar2.instance;
                emle emleVar4 = emle.a;
                emlaVar2.getClass();
                emleVar3.g = emlaVar2;
                emleVar3.b |= 8;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        engw j2 = j((String) ctms.b.e());
        if (j2.isEmpty()) {
            empty2 = Optional.empty();
        } else {
            emhv emhvVar = (emhv) j2.get(0);
            emlg emlgVar = emlg.a;
            try {
                InputStream f = ((emmt) this.b.b()).f(emhvVar);
                try {
                    emlg emlgVar2 = (emlg) eyfy.parseFrom(emlg.a, f, eyfc.a());
                    if (f != null) {
                        f.close();
                    }
                    if (((Long) ctms.c.e()).longValue() != 0) {
                        emlf emlfVar = (emlf) emlgVar2.toBuilder();
                        long longValue = ((Long) ctms.c.e()).longValue();
                        emlfVar.copyOnWrite();
                        emlg emlgVar3 = (emlg) emlfVar.instance;
                        emlgVar3.b |= 1;
                        emlgVar3.c = longValue;
                        emlgVar2 = (emlg) emlfVar.build();
                    }
                    if (((Integer) ctms.d.e()).intValue() != -1) {
                        emlf emlfVar2 = (emlf) emlgVar2.toBuilder();
                        int intValue2 = ((Integer) ctms.d.e()).intValue();
                        emlfVar2.copyOnWrite();
                        emlg emlgVar4 = (emlg) emlfVar2.instance;
                        emlgVar4.b |= 4;
                        emlgVar4.e = intValue2;
                        emlgVar2 = (emlg) emlfVar2.build();
                    }
                    if (((Integer) ctms.e.e()).intValue() != -1) {
                        emlf emlfVar3 = (emlf) emlgVar2.toBuilder();
                        int intValue3 = ((Integer) ctms.e.e()).intValue();
                        emlfVar3.copyOnWrite();
                        emlg emlgVar5 = (emlg) emlfVar3.instance;
                        emlgVar5.b |= 8;
                        emlgVar5.f = intValue3;
                        emlgVar2 = (emlg) emlfVar3.build();
                    }
                    empty2 = Optional.of(emlgVar2);
                } finally {
                }
            } catch (FileNotFoundException e) {
                ensk i = a.i();
                i.Y(ente.a, "Bugle");
                ((enrr) ((enrr) ((enrr) i).g(e)).h("com/google/android/apps/messaging/shared/util/p2p/common/SmartSuggestionConfigUtils", "maybeGetTemporalSuggestionProviderConfig", 759, "SmartSuggestionConfigUtils.java")).t("Could not find TemporalSuggestionProviderConfig file: %s", ctms.b.e());
                empty2 = Optional.empty();
            } catch (IOException e2) {
                ensk i2 = a.i();
                i2.Y(ente.a, "Bugle");
                ((enrr) ((enrr) ((enrr) i2).g(e2)).h("com/google/android/apps/messaging/shared/util/p2p/common/SmartSuggestionConfigUtils", "maybeGetTemporalSuggestionProviderConfig", 764, "SmartSuggestionConfigUtils.java")).t("Error reading TemporalSuggestionProviderConfig FileSpec: %s", ctms.b.e());
                empty2 = Optional.empty();
            }
        }
        empty2.ifPresent(new Consumer() { // from class: ctly
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                emld emldVar2 = emld.this;
                emlg emlgVar6 = (emlg) obj;
                emldVar2.copyOnWrite();
                emle emleVar3 = (emle) emldVar2.instance;
                emle emleVar4 = emle.a;
                emlgVar6.getClass();
                emleVar3.h = emlgVar6;
                emleVar3.b |= 16;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        boolean h = aewg.h();
        emldVar.copyOnWrite();
        emle emleVar3 = (emle) emldVar.instance;
        emleVar3.b |= 32;
        emleVar3.i = h;
        emldVar.copyOnWrite();
        emle emleVar4 = (emle) emldVar.instance;
        emleVar4.b |= 64;
        emleVar4.j = true;
        emkx emkxVar = (emkx) emky.a.createBuilder();
        boolean booleanValue = ((Boolean) ((cfup) ddnm.a.get()).e()).booleanValue();
        emkxVar.copyOnWrite();
        emky emkyVar = (emky) emkxVar.instance;
        emkyVar.b |= 1;
        emkyVar.c = booleanValue;
        emkxVar.copyOnWrite();
        emky emkyVar2 = (emky) emkxVar.instance;
        emkyVar2.b |= 2;
        emkyVar2.d = false;
        emldVar.copyOnWrite();
        emle emleVar5 = (emle) emldVar.instance;
        emky emkyVar3 = (emky) emkxVar.build();
        emkyVar3.getClass();
        emleVar5.k = emkyVar3;
        emleVar5.b |= 128;
        return (emle) emldVar.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final engw i(Optional optional, engy engyVar) {
        InputStream f;
        emjm emjmVar;
        final engx engxVar = new engx();
        optional.ifPresent(new Consumer() { // from class: ctlm
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                String str = (String) ctmo.s.e();
                engx.this.b(str, (emjk) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        enqu listIterator = engyVar.x().listIterator();
        while (listIterator.hasNext()) {
            String str = (String) listIterator.next();
            engw<emhv> a2 = engyVar.a(str);
            try {
                engr engrVar = new engr();
                for (emhv emhvVar : a2) {
                    try {
                        try {
                            try {
                                f = ((emmt) this.b.b()).f(emhvVar);
                                try {
                                    emjmVar = (emjm) eyfy.parseFrom(emjm.a, f, eyfc.a());
                                } catch (Throwable th) {
                                    if (f != null) {
                                        try {
                                            f.close();
                                        } catch (Throwable th2) {
                                            th.addSuppressed(th2);
                                        }
                                    }
                                    throw th;
                                }
                            } catch (Exception e) {
                                e = e;
                                ensk i = a.i();
                                i.Y(ente.a, "Bugle");
                                ((enrr) ((enrr) ((enrr) i).g(e)).h("com/google/android/apps/messaging/shared/util/p2p/common/SmartSuggestionConfigUtils", "getCascadedModelBasedProviderConfigsFromBaseModel", 847, "SmartSuggestionConfigUtils.java")).t("Failed to parse ModelBasedProvidersConfig for role: %s", str);
                            }
                        } catch (FileNotFoundException e2) {
                            ensk j = a.j();
                            j.Y(ente.a, "Bugle");
                            ((enrr) ((enrr) ((enrr) j).g(e2)).h("com/google/android/apps/messaging/shared/util/p2p/common/SmartSuggestionConfigUtils", "parseModelBasedProviderConfigsFromFileSpecsWithBackoff", 894, "SmartSuggestionConfigUtils.java")).t("Could not find file: %s", emms.b(emhvVar));
                        }
                    } catch (IOException e3) {
                        ensk j2 = a.j();
                        j2.Y(ente.a, "Bugle");
                        ((enrr) ((enrr) ((enrr) j2).g(e3)).h("com/google/android/apps/messaging/shared/util/p2p/common/SmartSuggestionConfigUtils", "parseModelBasedProviderConfigsFromFileSpecsWithBackoff", 897, "SmartSuggestionConfigUtils.java")).t("Error reading FileSpec: %s", emms.b(emhvVar));
                    }
                    if (emjmVar.b.size() != 1) {
                        throw new ctlf();
                    }
                    emjk emjkVar = (emjk) emjmVar.b.get(0);
                    if (emjkVar.b.size() != 1) {
                        throw new IllegalStateException("ModelBasedProviderConfig must have exactly one ModelConfigItem.");
                    }
                    engrVar.h(emjkVar);
                    if (f != null) {
                        f.close();
                    }
                }
                engxVar.d(str, engrVar.g());
            } catch (Exception e4) {
                e = e4;
            }
        }
        engy a3 = engxVar.a();
        engr engrVar2 = new engr();
        enqu listIterator2 = a3.x().listIterator();
        while (listIterator2.hasNext()) {
            String str2 = (String) listIterator2.next();
            engw a4 = a3.a(str2);
            if (a4.isEmpty()) {
                ensk j3 = a.j();
                j3.Y(ente.a, "Bugle");
                ((enrr) ((enrr) j3).h("com/google/android/apps/messaging/shared/util/p2p/common/SmartSuggestionConfigUtils", "getBackoffCascades", 927, "SmartSuggestionConfigUtils.java")).t("Failed to create backoff cascade with role: %s", str2);
            } else {
                emjn emjnVar = (emjn) ((emjo) ((emjk) a4.get(0)).b.get(0)).toBuilder();
                int i2 = 1;
                while (i2 < a4.size()) {
                    emjn emjnVar2 = (emjn) ((emjo) ((emjk) a4.get(i2)).b.get(0)).toBuilder();
                    emjnVar2.copyOnWrite();
                    emjo emjoVar = (emjo) emjnVar2.instance;
                    emjo emjoVar2 = (emjo) emjnVar.build();
                    emjoVar2.getClass();
                    emjoVar.e = emjoVar2;
                    emjoVar.b |= 2;
                    i2++;
                    emjnVar = emjnVar2;
                }
                emjj emjjVar = (emjj) emjk.a.createBuilder();
                emjjVar.a(emjnVar);
                engrVar2.h((emjk) emjjVar.build());
            }
        }
        return engrVar2.g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Optional k(InputStream inputStream, engw engwVar) {
        if (inputStream == null) {
            ensk j = a.j();
            j.Y(ente.a, "Bugle");
            ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/util/p2p/common/SmartSuggestionConfigUtils", "getDownloadedLinguaModelConfigFromInputStream", 1192, "SmartSuggestionConfigUtils.java")).t("Null fileInputStream for file: %s", emms.b((emhv) engwVar.get(0)));
            return Optional.empty();
        }
        emix emixVar = (emix) ((emjc) eyfy.parseFrom(emjc.a, inputStream, eyfc.a())).toBuilder();
        emixVar.copyOnWrite();
        emjc emjcVar = (emjc) emixVar.instance;
        emjcVar.g = 2;
        emjcVar.b |= 4;
        emhu emhuVar = (emhu) emhv.a.createBuilder();
        String t = t();
        emhuVar.copyOnWrite();
        emhv emhvVar = (emhv) emhuVar.instance;
        t.getClass();
        emhvVar.b = 2 | emhvVar.b;
        emhvVar.d = t;
        emixVar.copyOnWrite();
        emjc emjcVar2 = (emjc) emixVar.instance;
        emhv emhvVar2 = (emhv) emhuVar.build();
        emhvVar2.getClass();
        emjcVar2.c = emhvVar2;
        emjcVar2.b |= 1;
        return Optional.of((emjc) emixVar.build());
    }

    public final Optional l(Optional optional) {
        emjc emjcVar;
        if (optional.isPresent()) {
            emjcVar = (emjc) optional.get();
        } else {
            emix emixVar = (emix) emjc.a.createBuilder();
            emhu emhuVar = (emhu) emhv.a.createBuilder();
            String t = t();
            emhuVar.copyOnWrite();
            emhv emhvVar = (emhv) emhuVar.instance;
            t.getClass();
            emhvVar.b |= 2;
            emhvVar.d = t;
            emixVar.copyOnWrite();
            emjc emjcVar2 = (emjc) emixVar.instance;
            emhv emhvVar2 = (emhv) emhuVar.build();
            emhvVar2.getClass();
            emjcVar2.c = emhvVar2;
            emjcVar2.b |= 1;
            emixVar.copyOnWrite();
            emjc emjcVar3 = (emjc) emixVar.instance;
            emjcVar3.g = 2;
            emjcVar3.b |= 4;
            emixVar.copyOnWrite();
            emjc emjcVar4 = (emjc) emixVar.instance;
            emjcVar4.b |= 2;
            emjcVar4.f = 0;
            emixVar.a(o("empirical_probability_factor", ((Double) ctmo.m.e()).doubleValue()));
            emixVar.a(o("diversification_distance_threshold", ((Double) ctmo.o.e()).doubleValue()));
            emixVar.a(o("confidence_threshold", ((Double) ctmo.n.e()).doubleValue()));
            emixVar.b(p("SPAM", ((Integer) ctjd.b.e()).intValue() * ((Integer) ctjd.y.e()).intValue()));
            emixVar.b(p(PredictorResult.Types.REPLY_SUGGESTION, ((Integer) ctjd.b.e()).intValue() * ((Integer) ctjd.y.e()).intValue()));
            emjcVar = (emjc) emixVar.build();
        }
        emjj emjjVar = (emjj) emjk.a.createBuilder();
        emjn emjnVar = (emjn) emjo.a.createBuilder();
        emjnVar.copyOnWrite();
        emjo emjoVar = (emjo) emjnVar.instance;
        emjcVar.getClass();
        emjoVar.d = emjcVar;
        emjoVar.c = 7;
        emjjVar.a(emjnVar);
        return Optional.of((emjk) emjjVar.build());
    }
}
