package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.DesugarCollections;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duoq implements duqi {
    public final dupm a;
    private final engw b;

    public duoq(Context context) {
        this.a = dupm.e(context);
        int i = engw.d;
        engr engrVar = new engr();
        final duqf duqfVar = duqf.b;
        if (duqfVar == null) {
            synchronized (duqf.class) {
                duqfVar = duqf.b;
                if (duqfVar == null) {
                    duqfVar = new duqf(context);
                    ListenableFuture listenableFuture = duqfVar.h;
                    if (listenableFuture != null && !listenableFuture.isDone()) {
                        duqfVar.h.cancel(false);
                    }
                    duqk duqkVar = duqfVar.e;
                    final duow duowVar = (duow) duqkVar;
                    duqfVar.h = erny.f(((duow) duqkVar).b.a(), new emwl() { // from class: duou
                        @Override // defpackage.emwl
                        public final Object apply(Object obj) {
                            dupy dupyVar;
                            int i2;
                            dupy dupyVar2 = (dupy) obj;
                            duow duowVar2 = duow.this;
                            String o = duowVar2.d.a().o("emoji_variant_global_prefs");
                            try {
                                dupyVar = (dupy) eyfy.parseFrom(dupy.a, eoeg.e.k(o), eyfc.a());
                            } catch (eygu | IllegalArgumentException e) {
                                ((enrr) ((enrr) ((enrr) dupn.a.i()).g(e)).h("com/google/android/libraries/inputmethod/emoji/data/EmojiVariantPreferencesBackupHelper", "retrieveBackupForGlobalPreference", ']', "EmojiVariantPreferencesBackupHelper.java")).q("Unable to parse the retrieved backup proto");
                                dupyVar = null;
                            }
                            int i3 = 0;
                            if (!TextUtils.isEmpty(o)) {
                                enru enruVar = duxu.a;
                                duxs.a.b(dupr.a, 3);
                            }
                            HashMap hashMap = new HashMap();
                            if (!((Boolean) dupn.d.b()).booleanValue() || dupyVar == null) {
                                i2 = 0;
                            } else {
                                duqo duqoVar = dupyVar.c;
                                if (duqoVar == null) {
                                    duqoVar = duqo.a;
                                }
                                engw n = engw.n(duqoVar.b);
                                int c = duow.c(n);
                                int b = duow.b(n);
                                hashMap.putAll(DesugarCollections.unmodifiableMap(dupyVar.d));
                                i2 = b;
                                i3 = c;
                            }
                            duqo duqoVar2 = dupyVar2.c;
                            if (duqoVar2 == null) {
                                duqoVar2 = duqo.a;
                            }
                            engw n2 = engw.n(duqoVar2.b);
                            int c2 = duow.c(n2);
                            if (c2 != 0) {
                                i3 = c2;
                            }
                            int b2 = duow.b(n2);
                            if (b2 != 0) {
                                i2 = b2;
                            }
                            hashMap.putAll(DesugarCollections.unmodifiableMap(dupyVar2.d));
                            dupw dupwVar = (dupw) dupy.a.createBuilder();
                            duqn duqnVar = (duqn) duqo.a.createBuilder();
                            if (i3 != 0) {
                                duql duqlVar = (duql) duqm.a.createBuilder();
                                duqlVar.copyOnWrite();
                                duqm duqmVar = (duqm) duqlVar.instance;
                                duqmVar.c = Integer.valueOf(i3 - 1);
                                duqmVar.b = 1;
                                duqnVar.a(duqlVar);
                            }
                            if (i2 != 0) {
                                duql duqlVar2 = (duql) duqm.a.createBuilder();
                                duqlVar2.copyOnWrite();
                                duqm duqmVar2 = (duqm) duqlVar2.instance;
                                duqmVar2.c = Integer.valueOf(i2 - 1);
                                duqmVar2.b = 2;
                                duqnVar.a(duqlVar2);
                            }
                            duqo duqoVar3 = (duqo) duqnVar.build();
                            dupwVar.copyOnWrite();
                            dupy dupyVar3 = (dupy) dupwVar.instance;
                            duqoVar3.getClass();
                            dupyVar3.c = duqoVar3;
                            dupyVar3.b |= 1;
                            dupwVar.a(hashMap);
                            dupy dupyVar4 = (dupy) dupwVar.build();
                            if (!dupyVar4.equals(dupyVar2)) {
                                duowVar2.a(dupyVar4);
                            }
                            return dupyVar4;
                        }
                    }, ((duow) duqkVar).c);
                    duqfVar.i = erqt.d(duqfVar.h, duqfVar.f.k).a(new Callable() { // from class: duqc
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            duqf duqfVar2 = duqf.this;
                            dupy dupyVar = (dupy) dupt.a(duqfVar2.h, dupy.a);
                            duqfVar2.d.putAll(DesugarCollections.unmodifiableMap(dupyVar.d));
                            duqo duqoVar = dupyVar.c;
                            if (duqoVar == null) {
                                duqoVar = duqo.a;
                            }
                            duqfVar2.c.set(duqoVar);
                            return null;
                        }
                    }, duqfVar.g);
                    erqt.r(duqfVar.i, new duqe(), duqfVar.g);
                    duqf.b = duqfVar;
                }
            }
        }
        engrVar.h(duqfVar);
        final duqt duqtVar = duqt.b;
        if (duqtVar == null) {
            synchronized (duqt.class) {
                duqtVar = duqt.b;
                if (duqtVar == null) {
                    duqtVar = new duqt(context);
                    ListenableFuture listenableFuture2 = duqtVar.h;
                    if (listenableFuture2 != null && !listenableFuture2.isDone()) {
                        duqtVar.h.cancel(true);
                    }
                    duqk duqkVar2 = duqtVar.f;
                    final dupa dupaVar = (dupa) duqkVar2;
                    duqtVar.h = erqt.m(new Callable() { // from class: duoy
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            IOException iOException;
                            dupq dupqVar;
                            FileInputStream fileInputStream;
                            enhd enhdVar = new enhd();
                            dupa dupaVar2 = dupa.this;
                            for (String str : (Set) dupaVar2.d.a().e("emoji_variant_prefs", Set.class, enpd.a, null)) {
                                List i2 = dupn.c.i(str);
                                if (i2.size() == 2) {
                                    enhdVar.k((String) i2.get(0), (String) i2.get(1));
                                } else {
                                    ((enrr) ((enrr) dupn.a.j()).h("com/google/android/libraries/inputmethod/emoji/data/EmojiVariantPreferencesBackupHelper", "retrieveBackup", 138, "EmojiVariantPreferencesBackupHelper.java")).t("Malformed entry in serialized emoji variant preferences: %s", str);
                                }
                            }
                            enhk c = enhdVar.c();
                            if (!c.isEmpty()) {
                                enru enruVar = duxu.a;
                                duxs.a.b(dupr.a, 1);
                            }
                            HashMap hashMap = new HashMap(c);
                            Map hashMap2 = new HashMap();
                            synchronized (dupaVar2.e) {
                                try {
                                    fileInputStream = new FileInputStream(dupaVar2.a());
                                } catch (IOException e) {
                                    iOException = e;
                                }
                                try {
                                    hashMap2 = DesugarCollections.unmodifiableMap(((dupq) eyfy.parseFrom(dupq.a, fileInputStream, eyfc.a())).b);
                                    hashMap.putAll(hashMap2);
                                    fileInputStream.close();
                                } catch (Throwable th) {
                                    Map map = hashMap2;
                                    try {
                                        fileInputStream.close();
                                        throw th;
                                    } catch (Throwable th2) {
                                        try {
                                            th.addSuppressed(th2);
                                            throw th;
                                        } catch (IOException e2) {
                                            iOException = e2;
                                            hashMap2 = map;
                                            ((enrr) ((enrr) ((enrr) dupa.a.i()).g(iOException)).h("com/google/android/libraries/inputmethod/emoji/data/DefaultStickyPreferencesProtoProvider", "loadFromStickyPreferences", 'f', "DefaultStickyPreferencesProtoProvider.java")).q("Failed to load sticky preferences from file");
                                            dupp duppVar = (dupp) dupq.a.createBuilder();
                                            duppVar.a(hashMap);
                                            dupqVar = (dupq) duppVar.build();
                                            if (((Boolean) dupn.d.b()).booleanValue()) {
                                                dupaVar2.b(dupqVar);
                                            }
                                            return dupqVar;
                                        }
                                    }
                                }
                            }
                            dupp duppVar2 = (dupp) dupq.a.createBuilder();
                            duppVar2.a(hashMap);
                            dupqVar = (dupq) duppVar2.build();
                            if (((Boolean) dupn.d.b()).booleanValue() && !ennc.m(c, hashMap2)) {
                                dupaVar2.b(dupqVar);
                            }
                            return dupqVar;
                        }
                    }, ((dupa) duqkVar2).c);
                    duqtVar.g = erqt.d(duqtVar.h, duqtVar.c.k).a(new Callable() { // from class: duqr
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            ((enrr) ((enrr) duqt.a.g()).h("com/google/android/libraries/inputmethod/emoji/data/StickyVariantsPreferences", "initStickyVariantsPreferences", 97, "StickyVariantsPreferences.java")).q("Successfully load sticky preferences from disk");
                            final duqt duqtVar2 = duqt.this;
                            duqtVar2.d.putAll(DesugarCollections.unmodifiableMap(((dupq) dupt.a(duqtVar2.h, dupq.a)).b));
                            dupm dupmVar = duqtVar2.c;
                            enip x = !dups.a(dupmVar.k) ? enpd.a : ((engy) dupmVar.i.get()).x();
                            Map map = duqtVar2.d;
                            enip o = enip.o(x);
                            if (o.containsAll(map.keySet())) {
                                return null;
                            }
                            enip d = enpw.b(duqtVar2.d.keySet(), o).d();
                            ((enrr) ((enrr) duqt.a.h()).h("com/google/android/libraries/inputmethod/emoji/data/StickyVariantsPreferences", "maybeMigrateBaseVariantKeys", 162, "StickyVariantsPreferences.java")).r("Attempting to migrate %d sticky preferences to new base variant", d.size());
                            enqu listIterator = d.listIterator();
                            while (listIterator.hasNext()) {
                                String str = (String) listIterator.next();
                                final String str2 = (String) duqtVar2.d.get(str);
                                if (str2 == null) {
                                    ((enrr) ((enrr) duqt.a.i()).h("com/google/android/libraries/inputmethod/emoji/data/StickyVariantsPreferences", "maybeMigrateBaseVariantKeys", 168, "StickyVariantsPreferences.java")).t("%s not found in base variant --> sticky variant map", str);
                                } else {
                                    emxc c = enjk.c(o, new emxg() { // from class: duqs
                                        @Override // defpackage.emxg
                                        public final boolean a(Object obj) {
                                            return duqt.this.c.c((String) obj).contains(str2);
                                        }
                                    });
                                    if (c.g()) {
                                        ((enrr) ((enrr) duqt.a.e()).h("com/google/android/libraries/inputmethod/emoji/data/StickyVariantsPreferences", "maybeMigrateBaseVariantKeys", 181, "StickyVariantsPreferences.java")).D("Migrated sticky preference for %s to new base variant %s", str, c);
                                        duqtVar2.d.put((String) c.c(), str2);
                                    } else {
                                        ((enrr) ((enrr) duqt.a.j()).h("com/google/android/libraries/inputmethod/emoji/data/StickyVariantsPreferences", "maybeMigrateBaseVariantKeys", 177, "StickyVariantsPreferences.java")).D("%s missing in variant map, discarding sticky preference for old base variant %s", str2, str);
                                    }
                                    duqtVar2.d.remove(str);
                                }
                            }
                            ((dupa) duqtVar2.f).b(duqtVar2.a());
                            return null;
                        }
                    }, duqtVar.e);
                    duqt.b = duqtVar;
                }
            }
        }
        engrVar.h(duqtVar);
        this.b = engrVar.g();
    }

    @Override // defpackage.duqi
    public final /* synthetic */ duqh a() {
        return this.a;
    }

    @Override // defpackage.duqj
    public final ListenableFuture b() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            engw engwVar = this.b;
            if (i >= ((enou) engwVar).c) {
                return erqt.a(arrayList).a(new Callable() { // from class: duop
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return null;
                    }
                }, erpp.a);
            }
            arrayList.add(((duqj) engwVar.get(i)).b());
            i++;
        }
    }

    @Override // defpackage.duqj
    public final String c(String str) {
        String str2;
        String str3 = null;
        int i = 0;
        duqf duqfVar = null;
        duqt duqtVar = null;
        while (true) {
            engw engwVar = this.b;
            if (i >= ((enou) engwVar).c) {
                break;
            }
            duqj duqjVar = (duqj) engwVar.get(i);
            if (duqjVar instanceof duqf) {
                duqfVar = (duqf) duqjVar;
            }
            if (duqjVar instanceof duqt) {
                duqtVar = (duqt) duqjVar;
            }
            i++;
        }
        duqg a = this.a.a(str);
        if (duqfVar == null || a == duqg.SKINTONE_AND_GENDER_DIRECTIONAL) {
            str2 = null;
        } else {
            str2 = duqfVar.c(str);
            if (str2 != null) {
                return str2;
            }
        }
        if (duqtVar == null) {
            return str2;
        }
        String str4 = (String) duqtVar.d.get(duqtVar.c.d(str));
        if (duqfVar != null) {
            if (str4 != null) {
                str = str4;
            }
            duqo b = duqfVar.f.b(str);
            if (b != null && enjk.q(b.b, new dupz()) && enjk.q(b.b, new duqa())) {
                duqm g = duqfVar.g();
                if (g == null) {
                    g = duqf.f(b);
                }
                duqm h = duqfVar.h();
                if (h == null) {
                    h = duqf.i(b);
                }
                str3 = duqfVar.k(duqfVar.f.d(str), duqf.j(h, g, duqfVar.a(str)));
            }
        }
        return str3 == null ? str4 : str3;
    }

    @Override // defpackage.duqj
    public final boolean d(String str) {
        int i = 0;
        boolean z = false;
        while (true) {
            engw engwVar = this.b;
            if (i >= ((enou) engwVar).c) {
                return z;
            }
            z = ((duqj) engwVar.get(i)).d(str) || z;
            i++;
        }
    }

    @Override // defpackage.duqj
    public final int e() {
        if (this.b.isEmpty()) {
            return 1;
        }
        return ((duqj) this.b.get(0)).e();
    }
}
