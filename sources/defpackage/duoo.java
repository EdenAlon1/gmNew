package defpackage;

import android.content.Context;
import android.os.Trace;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duoo {
    public static volatile duoo c;
    private final Map g = new cmh();
    public static final enru a = enru.c("com/google/android/libraries/inputmethod/emoji/data/BundledEmojiListLoader");
    public static final int[] b = {R.string.emoji_category_recent, R.string.emoji_category_emotions, R.string.emoji_category_people, R.string.emoji_category_animals_nature, R.string.emoji_category_food_drink, R.string.emoji_category_travel_places, R.string.emoji_category_activity, R.string.emoji_category_objects, R.string.emoji_category_symbols, R.string.emoji_category_flags};
    private static final dume e = new dume();
    private static final dume f = new dume();
    static final duvz d = duwb.d("enable_emoji_loader_migration");

    static engw a(InputStream inputStream) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
        try {
            emye b2 = emye.b(',');
            int i = engw.d;
            engr engrVar = new engr();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    engw g = engrVar.g();
                    bufferedReader.close();
                    return g;
                }
                List i2 = b2.i(readLine);
                int size = i2.size();
                duph duphVar = null;
                if (size != 0) {
                    if (size != 1) {
                        duphVar = new duph((String) i2.get(0), engw.n(i2.subList(1, i2.size())));
                    } else {
                        String str = (String) i2.get(0);
                        if (!TextUtils.isEmpty(str)) {
                            duphVar = new duph(str, enou.a);
                        }
                    }
                }
                if (duphVar != null) {
                    engrVar.h(duphVar);
                }
            }
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final synchronized ListenableFuture b(Context context, errl errlVar, final duur duurVar) {
        char c2;
        char c3;
        dupg dupgVar;
        final Context context2 = context;
        final errl errlVar2 = errlVar;
        final duur duurVar2 = duurVar;
        synchronized (this) {
            ListenableFuture listenableFuture = (ListenableFuture) this.g.get(duurVar2);
            if (listenableFuture != null) {
                return listenableFuture;
            }
            ozg.a("BundledEmojiListLoader.load");
            try {
                int i = engw.d;
                engr engrVar = new engr();
                char c4 = 1;
                List b2 = dupd.b(context2, true != duut.b(duut.instance.j) ? R.array.emoji_list_raw_resources : R.array.emoji_list_raw_resources_with_gender_inclusive);
                engrVar.h(erqt.i(enou.a));
                char c5 = 0;
                int i2 = 0;
                while (i2 < b2.size()) {
                    final int intValue = ((Integer) b2.get(i2)).intValue();
                    if (((Boolean) d.b()).booleanValue()) {
                        ozg.a("BundledEmojiListLoader.loadFromFileBinaryStringCache");
                        try {
                            Locale locale = Locale.US;
                            Integer valueOf = Integer.valueOf(duurVar2.hashCode());
                            Integer valueOf2 = Integer.valueOf(i2);
                            Integer valueOf3 = Integer.valueOf(duut.b(duurVar2) ? 1 : 0);
                            Object[] objArr = new Object[3];
                            objArr[c5] = valueOf;
                            objArr[c4] = valueOf2;
                            objArr[2] = valueOf3;
                            final String format = String.format(locale, "emoji-filter-flag.v2.%s.%d.%d", objArr);
                            final dumt dumtVar = (dumt) f.a(new emyl() { // from class: duoh
                                @Override // defpackage.emyl
                                public final Object get() {
                                    enru enruVar = duoo.a;
                                    duml f2 = dumo.f(context2);
                                    f2.d();
                                    f2.c();
                                    return new dumt(new duoj(f2), new duon());
                                }
                            });
                            final ListenableFuture b3 = dumtVar.b(format, errlVar2);
                            if (dupg.b == null) {
                                c2 = c4;
                                c3 = c5;
                                ((enrr) dupg.a.a(duwj.a).h("com/google/android/libraries/inputmethod/emoji/data/EmojiSetSupplier", "getInstance", 85, "EmojiSetSupplier.java")).q("EmojiSetSupplier#initialize() must be called before use.");
                                dupgVar = dupg.c;
                            } else {
                                c2 = c4;
                                c3 = c5;
                                dupgVar = dupg.b;
                            }
                            final ListenableFuture listenableFuture2 = dupgVar.d;
                            ListenableFuture[] listenableFutureArr = new ListenableFuture[2];
                            listenableFutureArr[c3] = b3;
                            listenableFutureArr[c2] = listenableFuture2;
                            final errl errlVar3 = errlVar2;
                            errlVar2 = errlVar3;
                            ListenableFuture a2 = erqt.d(listenableFutureArr).a(new Callable() { // from class: duok
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    enru enruVar = duoo.a;
                                    engw<duph> engwVar = (engw) ((enhk) erqt.q(ListenableFuture.this)).get(Integer.valueOf(intValue));
                                    if (engwVar == null) {
                                        int i3 = engw.d;
                                        return enou.a;
                                    }
                                    engw engwVar2 = (engw) erqt.q(b3);
                                    if (engwVar2 == null || engwVar2.size() != engwVar.size()) {
                                        duuw.a();
                                        engr engrVar2 = new engr();
                                        for (duph duphVar : engwVar) {
                                            duur duurVar3 = duurVar;
                                            StringBuilder sb = new StringBuilder();
                                            sb.append(true != duuw.c(duphVar.a, duurVar3) ? '0' : '1');
                                            engw engwVar3 = duphVar.b;
                                            int size = engwVar3.size();
                                            for (int i4 = 0; i4 < size; i4++) {
                                                sb.append(true != duuw.c((String) engwVar3.get(i4), duurVar3) ? '0' : '1');
                                            }
                                            engrVar2.h(sb.toString());
                                        }
                                        errl errlVar4 = errlVar3;
                                        String str = format;
                                        dumt dumtVar2 = dumtVar;
                                        engwVar2 = engrVar2.g();
                                        dumtVar2.d(str, engwVar2, errlVar4);
                                    }
                                    engr engrVar3 = new engr();
                                    for (int i5 = 0; i5 < engwVar2.size(); i5++) {
                                        String str2 = (String) engwVar2.get(i5);
                                        if (!str2.isEmpty()) {
                                            duph duphVar2 = (duph) engwVar.get(i5);
                                            if (str2.indexOf(48) == -1) {
                                                engrVar3.h(duphVar2);
                                            } else if (str2.indexOf(49) != -1) {
                                                engr engrVar4 = new engr();
                                                for (int i6 = 1; i6 < str2.length(); i6++) {
                                                    if (str2.charAt(i6) == '1') {
                                                        engrVar4.h((String) duphVar2.b.get(i6 - 1));
                                                    }
                                                }
                                                engw g = engrVar4.g();
                                                if (str2.charAt(0) == '1') {
                                                    String str3 = duphVar2.a;
                                                    if (((enou) g).c == 1) {
                                                        g = enou.a;
                                                    }
                                                    engrVar3.h(new duph(str3, g));
                                                } else {
                                                    enou enouVar = (enou) g;
                                                    if (enouVar.c > 0) {
                                                        String str4 = (String) g.get(0);
                                                        if (enouVar.c == 1) {
                                                            g = enou.a;
                                                        }
                                                        engrVar3.h(new duph(str4, g));
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    return engrVar3.g();
                                }
                            }, errlVar2);
                            Trace.endSection();
                            engrVar.h(a2);
                            duurVar2 = duurVar;
                            i2++;
                            context2 = context;
                            c4 = c2;
                            c5 = c3;
                        } finally {
                        }
                    } else {
                        c2 = c4;
                        c3 = c5;
                        ozg.a("BundledEmojiListLoader.loadFromFile");
                        try {
                            Locale locale2 = Locale.US;
                            Integer valueOf4 = Integer.valueOf(duurVar.hashCode());
                            Integer valueOf5 = Integer.valueOf(i2);
                            Integer valueOf6 = Integer.valueOf(duut.b(duurVar) ? 1 : 0);
                            Object[] objArr2 = new Object[3];
                            objArr2[c3] = valueOf4;
                            objArr2[c2] = valueOf5;
                            objArr2[2] = valueOf6;
                            final String format2 = String.format(locale2, "emoji.v2.%s.%d.%d", objArr2);
                            final dumt dumtVar2 = (dumt) e.a(new emyl() { // from class: duol
                                @Override // defpackage.emyl
                                public final Object get() {
                                    enru enruVar = duoo.a;
                                    duml f2 = dumo.f(context2);
                                    f2.d();
                                    f2.c();
                                    return new dumt(new duoj(f2), new duom());
                                }
                            });
                            duurVar2 = duurVar;
                            ListenableFuture g = erny.g(dumtVar2.b(format2, errlVar2), new eroh() { // from class: duoi
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // defpackage.eroh
                                public final ListenableFuture a(Object obj) {
                                    engw engwVar = (engw) obj;
                                    enru enruVar = duoo.a;
                                    errl errlVar4 = errlVar2;
                                    dumt dumtVar3 = dumtVar2;
                                    String str = format2;
                                    duur duurVar3 = duurVar2;
                                    int i3 = intValue;
                                    Context context3 = context2;
                                    if (engwVar != null && !engwVar.isEmpty()) {
                                        ((enrr) ((enrr) duoo.a.g()).h("com/google/android/libraries/inputmethod/emoji/data/BundledEmojiListLoader", "loadFromFile", 231, "BundledEmojiListLoader.java")).q("Using emoji list from renderability cache");
                                        return erqt.i(engwVar);
                                    }
                                    ((enrr) ((enrr) duoo.a.g()).h("com/google/android/libraries/inputmethod/emoji/data/BundledEmojiListLoader", "loadFromFile", 234, "BundledEmojiListLoader.java")).q("Did not find emoji list in renderability cache");
                                    try {
                                        engw a3 = duoo.a(context3.getResources().openRawResource(i3));
                                        duuw.a();
                                        int i4 = engw.d;
                                        engr engrVar2 = new engr();
                                        enqv it = a3.iterator();
                                        while (it.hasNext()) {
                                            duph duphVar = (duph) it.next();
                                            engw d2 = duuw.d(duphVar.b, duurVar3);
                                            if (duuw.c(duphVar.a, duurVar3)) {
                                                String str2 = duphVar.a;
                                                if (((enou) d2).c == 1) {
                                                    d2 = enou.a;
                                                }
                                                engrVar2.h(new duph(str2, d2));
                                            } else if (((enou) d2).c > 0) {
                                                String str3 = (String) d2.get(0);
                                                if (((enou) d2).c == 1) {
                                                    d2 = enou.a;
                                                }
                                                engrVar2.h(new duph(str3, d2));
                                            }
                                        }
                                        engw g2 = engrVar2.g();
                                        dumtVar3.d(str, g2, errlVar4);
                                        return erqt.i(g2);
                                    } catch (IOException e2) {
                                        ((enrr) ((enrr) ((enrr) duoo.a.i()).g(e2)).h("com/google/android/libraries/inputmethod/emoji/data/BundledEmojiListLoader", "loadFromFile", 242, "BundledEmojiListLoader.java")).t("error save to emoji cache file: %s", str);
                                        int i5 = engw.d;
                                        return erqt.i(enou.a);
                                    }
                                }
                            }, errlVar2);
                            Trace.endSection();
                            engrVar.h(g);
                            i2++;
                            context2 = context;
                            c4 = c2;
                            c5 = c3;
                        } finally {
                        }
                    }
                }
                ListenableFuture e2 = erqt.e(engrVar.g());
                Trace.endSection();
                this.g.put(duurVar2, e2);
                return e2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
