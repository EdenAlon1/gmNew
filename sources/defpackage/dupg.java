package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dupg implements emyl {
    public static volatile dupg b;
    public final ListenableFuture d;
    private final Future e;
    private volatile enip f;
    public static final enru a = enru.c("com/google/android/libraries/inputmethod/emoji/data/EmojiSetSupplier");
    public static final dupg c = new dupg(erqt.i(new enin().g()));

    public dupg(final Context context, Executor executor) {
        Executor b2 = dunl.b(executor);
        ListenableFuture m = erqt.m(new Callable() { // from class: dupf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                enru enruVar = dupg.a;
                Context context2 = context;
                Resources resources = context2.getResources();
                enhd enhdVar = new enhd();
                List<Integer> b3 = dupd.b(context2, dupd.a());
                emye b4 = emye.b(',');
                for (Integer num : b3) {
                    int intValue = num.intValue();
                    int i = engw.d;
                    engr engrVar = new engr();
                    try {
                        InputStreamReader inputStreamReader = new InputStreamReader(resources.openRawResource(intValue), StandardCharsets.UTF_8);
                        try {
                            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                            while (true) {
                                try {
                                    String readLine = bufferedReader.readLine();
                                    if (readLine == null) {
                                        break;
                                    }
                                    List i2 = b4.i(readLine);
                                    if (i2.size() == 1) {
                                        engrVar.h(new duph((String) i2.get(0), enou.a));
                                    } else if (i2.size() >= 2) {
                                        engrVar.h(new duph((String) i2.get(0), engw.n(i2.subList(1, i2.size()))));
                                    }
                                } catch (Throwable th) {
                                    try {
                                        bufferedReader.close();
                                        throw th;
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                        throw th;
                                    }
                                }
                            }
                            bufferedReader.close();
                            inputStreamReader.close();
                            enhdVar.k(num, engrVar.g());
                        } catch (Throwable th3) {
                            try {
                                inputStreamReader.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    } catch (IOException e) {
                        ((enrr) ((enrr) ((enrr) dupg.a.i()).g(e)).h("com/google/android/libraries/inputmethod/emoji/data/EmojiSetSupplier", "getDefaultEmojiVariantList", (char) 216, "EmojiSetSupplier.java")).q("Reading emoji list failed.");
                        return enoz.a;
                    }
                }
                return enhdVar.c();
            }
        }, b2);
        this.d = m;
        this.e = erny.f(m, new emwl() { // from class: dupe
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                int i;
                enhk enhkVar = (enhk) obj;
                enru enruVar = dupg.a;
                enin eninVar = new enin();
                for (Integer num : dupd.b(context, dupd.a())) {
                    num.intValue();
                    engw engwVar = (engw) enhkVar.get(num);
                    if (engwVar != null) {
                        int size = engwVar.size();
                        int i2 = 0;
                        while (i2 < size) {
                            duph duphVar = (duph) engwVar.get(i2);
                            eninVar.c(duphVar.a);
                            eninVar.c(duphVar.a);
                            engw engwVar2 = duphVar.b;
                            int size2 = engwVar2.size();
                            int i3 = 0;
                            while (true) {
                                i = i2 + 1;
                                if (i3 < size2) {
                                    eninVar.c((String) engwVar2.get(i3));
                                    i3++;
                                }
                            }
                            i2 = i;
                        }
                    }
                }
                return eninVar.g();
            }
        }, b2);
    }

    @Override // defpackage.emyl
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final enip get() {
        dvag dvagVar = new dvag("EmojiSetSupplier.get");
        try {
            if (this.f == null) {
                synchronized (this) {
                    if (this.f == null) {
                        try {
                            this.f = (enip) this.e.get(10L, TimeUnit.SECONDS);
                        } catch (InterruptedException | ExecutionException | TimeoutException e) {
                            ((enrr) ((enrr) ((enrr) a.i()).g(e)).h("com/google/android/libraries/inputmethod/emoji/data/EmojiSetSupplier", "get", (char) 127, "EmojiSetSupplier.java")).q("Reading emoji list failed.");
                            this.f = enpd.a;
                        }
                    }
                }
            }
            enip enipVar = this.f;
            dvagVar.close();
            return enipVar;
        } finally {
        }
    }

    public dupg(Future future) {
        this.e = future;
        this.d = erqt.i(enoz.a);
    }
}
