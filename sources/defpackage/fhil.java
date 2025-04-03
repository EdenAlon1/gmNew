package defpackage;

import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhil {
    public final List a;
    private int b;

    public fhil(List list) {
        this.a = list;
    }

    public final fhhf a() {
        if (!b()) {
            throw new NoSuchElementException();
        }
        List list = this.a;
        int i = this.b;
        this.b = i + 1;
        return (fhhf) list.get(i);
    }

    public final boolean b() {
        return this.b < this.a.size();
    }
}
