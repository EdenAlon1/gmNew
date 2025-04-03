package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eewn implements eewp {
    private final String a;
    private final Map b = new HashMap();
    private final Map c = new HashMap();

    public eewn(String str) {
        this.a = str;
    }

    @Override // defpackage.eewo
    public final synchronized eewl a(String str) {
        return (eewl) this.b.get(str);
    }

    @Override // defpackage.eewo
    public final synchronized eewm b(String str) {
        return (eewm) this.c.get(str);
    }

    @Override // defpackage.eewm
    public final String c() {
        return this.a;
    }

    @Override // defpackage.eewm
    public final synchronized List d() {
        return new ArrayList(this.b.values());
    }

    @Override // defpackage.eewm
    public final synchronized List e() {
        return new ArrayList(this.c.values());
    }

    @Override // defpackage.eewp
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final synchronized void g(eewl eewlVar) {
        this.b.put(eewlVar.b(), eewlVar);
    }

    @Override // defpackage.eewp
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final synchronized void i(eewm eewmVar) {
        this.c.put(eewmVar.c(), eewmVar);
    }
}
