package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dupm implements duqh {
    public static final enru a = enru.c("com/google/android/libraries/inputmethod/emoji/data/EmojiVariantDataProvider");
    public static final duqo b;
    public static final engw c;
    public static final engw d;
    public static final enhk e;
    private static volatile dupm l;
    public final AtomicReference f = new AtomicReference(enoz.a);
    public final AtomicReference g = new AtomicReference(enoz.a);
    public final AtomicReference h = new AtomicReference(enoz.a);
    public final AtomicReference i = new AtomicReference(enet.a);
    public final AtomicReference j = new AtomicReference(enet.a);
    public ListenableFuture k;
    private final Executor m;

    static {
        duqn duqnVar = (duqn) duqo.a.createBuilder();
        duql duqlVar = (duql) duqm.a.createBuilder();
        duqlVar.copyOnWrite();
        duqm duqmVar = (duqm) duqlVar.instance;
        duqmVar.c = 0;
        duqmVar.b = 1;
        duqnVar.b((duqm) duqlVar.build());
        duql duqlVar2 = (duql) duqm.a.createBuilder();
        duqlVar2.copyOnWrite();
        duqm duqmVar2 = (duqm) duqlVar2.instance;
        duqmVar2.c = 0;
        duqmVar2.b = 2;
        duqnVar.b((duqm) duqlVar2.build());
        b = (duqo) duqnVar.build();
        Integer valueOf = Integer.valueOf(R.raw.emoji_category_emotions);
        c = engw.s(valueOf, Integer.valueOf(R.raw.emoji_category_people_gender_inclusive));
        d = engw.s(valueOf, Integer.valueOf(R.raw.emoji_category_people));
        duqn duqnVar2 = (duqn) duqo.a.createBuilder();
        duql duqlVar3 = (duql) duqm.a.createBuilder();
        duqlVar3.copyOnWrite();
        duqm duqmVar3 = (duqm) duqlVar3.instance;
        duqmVar3.c = 1;
        duqmVar3.b = 2;
        duqnVar2.b((duqm) duqlVar3.build());
        duqo duqoVar = (duqo) duqnVar2.build();
        duqn duqnVar3 = (duqn) duqo.a.createBuilder();
        duql duqlVar4 = (duql) duqm.a.createBuilder();
        duqlVar4.copyOnWrite();
        duqm duqmVar4 = (duqm) duqlVar4.instance;
        duqmVar4.c = 3;
        duqmVar4.b = 2;
        duqnVar3.b((duqm) duqlVar4.build());
        duqo duqoVar2 = (duqo) duqnVar3.build();
        duqn duqnVar4 = (duqn) duqo.a.createBuilder();
        duql duqlVar5 = (duql) duqm.a.createBuilder();
        duqlVar5.copyOnWrite();
        duqm duqmVar5 = (duqm) duqlVar5.instance;
        duqmVar5.c = 2;
        duqmVar5.b = 2;
        duqnVar4.b((duqm) duqlVar5.build());
        e = enhk.l("👯", engw.t(duqoVar, duqoVar2, (duqo) duqnVar4.build()));
    }

    private dupm(Executor executor) {
        this.m = executor;
    }

    public static dupm e(final Context context) {
        dupm dupmVar;
        dupm dupmVar2 = l;
        if (dupmVar2 != null) {
            return dupmVar2;
        }
        synchronized (dupm.class) {
            dupmVar = l;
            if (dupmVar == null) {
                final dupm dupmVar3 = new dupm(dunl.a().e);
                ListenableFuture f = erny.f(erqt.m(new Callable() { // from class: dupk
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        enru enruVar = dupm.a;
                        int i = engw.d;
                        engr engrVar = new engr();
                        boolean b2 = duut.b(duut.instance.j);
                        Context context2 = context;
                        engw engwVar = b2 ? dupm.c : dupm.d;
                        for (int i2 = 0; i2 < ((enou) engwVar).c; i2++) {
                            try {
                                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context2.getResources().openRawResource(((Integer) engwVar.get(i2)).intValue()), StandardCharsets.UTF_8));
                                while (true) {
                                    try {
                                        String readLine = bufferedReader.readLine();
                                        if (readLine == null) {
                                            break;
                                        }
                                        List i3 = emye.b(',').i(readLine);
                                        if (i3.size() > 1) {
                                            engrVar.h(engw.n(i3));
                                        }
                                    } finally {
                                    }
                                }
                                bufferedReader.close();
                            } catch (IOException e2) {
                                ((enrr) ((enrr) dupm.a.i()).h("com/google/android/libraries/inputmethod/emoji/data/EmojiVariantDataProvider", "loadVariantsMapsFromDisk", 295, "EmojiVariantDataProvider.java")).q("Failed to load emoji variation data.");
                                throw e2;
                            }
                        }
                        return engrVar.g();
                    }
                }, dupmVar3.m), new emwl() { // from class: dupj
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:29:0x0297  */
                    /* JADX WARN: Removed duplicated region for block: B:32:0x02a9 A[SYNTHETIC] */
                    @Override // defpackage.emwl
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object apply(java.lang.Object r24) {
                        /*
                            Method dump skipped, instructions count: 818
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.dupj.apply(java.lang.Object):java.lang.Object");
                    }
                }, dupmVar3.m);
                dupmVar3.k = f;
                erqt.r(f, new dupl(), dupmVar3.m);
                l = dupmVar3;
                dupmVar = dupmVar3;
            }
        }
        return dupmVar;
    }

    public final duqg a(String str) {
        return (duqg) ((enhk) this.f.get()).get(d(str));
    }

    public final duqo b(String str) {
        return (duqo) ((enhk) this.h.get()).get(str);
    }

    @Override // defpackage.duqh
    public final engw c(String str) {
        if (!dups.a(this.k)) {
            int i = engw.d;
            return enou.a;
        }
        engw a2 = ((engy) this.i.get()).a(d(str));
        if (a2 != null) {
            return a2;
        }
        int i2 = engw.d;
        return enou.a;
    }

    @Override // defpackage.duqh
    public final String d(String str) {
        String str2;
        return (dups.a(this.k) && (str2 = (String) enjk.m(((engy) this.j.get()).a(str), null)) != null) ? str2 : str;
    }
}
