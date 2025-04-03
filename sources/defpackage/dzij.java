package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzij extends dzjc {
    public emxc a;
    public Set b;
    public emxc c;
    public String d;

    public dzij() {
        emux emuxVar = emux.a;
        this.a = emuxVar;
        this.c = emuxVar;
    }

    @Override // defpackage.dzjc
    public final void a(String str) {
        this.c = emxc.j(str);
    }

    @Override // defpackage.dzjc
    public final void b(String str) {
        this.a = emxc.j(str);
    }

    @Override // defpackage.dzjc
    public final void c(Set set) {
        if (set == null) {
            throw new NullPointerException("Null phoneNumbers");
        }
        this.b = set;
    }

    @Override // defpackage.dzjc
    public final void d(String str) {
        if (str == null) {
            throw new NullPointerException("Null tachyonAppName");
        }
        this.d = str;
    }
}
