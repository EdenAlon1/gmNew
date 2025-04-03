package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import j$.lang.Iterable$EL;
import j$.util.function.Consumer$CC;
import java.util.HashMap;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aoug {
    private final aqkp b;
    public final HashMap a = new HashMap();
    private final Object c = new Object();

    public aoug(aqkp aqkpVar, engw engwVar) {
        this.b = aqkpVar;
        Iterable$EL.forEach(engwVar, new Consumer() { // from class: aouf
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ResolvedRecipient resolvedRecipient = (ResolvedRecipient) obj;
                aoug.this.a.put(resolvedRecipient.F().a, resolvedRecipient);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public final int a() {
        int size;
        synchronized (this.c) {
            size = this.a.size();
        }
        return size;
    }

    public final ResolvedRecipient b(String str) {
        ResolvedRecipient resolvedRecipient;
        synchronized (this.c) {
            resolvedRecipient = (ResolvedRecipient) this.a.get(str);
        }
        if (resolvedRecipient != null) {
            return resolvedRecipient;
        }
        aqkv aqkvVar = new aqkv(str);
        ResolvedRecipient resolvedRecipient2 = (ResolvedRecipient) ((enhk) this.b.e(engw.r(aqkvVar)).c()).get(aqkvVar);
        if (resolvedRecipient2 == null) {
            return resolvedRecipient2;
        }
        synchronized (this.c) {
            if (!this.a.containsKey(str)) {
                this.a.put(str, resolvedRecipient2);
            }
        }
        return resolvedRecipient2;
    }

    public final engw c() {
        engw n;
        synchronized (this.c) {
            n = engw.n(this.a.values());
        }
        return n;
    }
}
