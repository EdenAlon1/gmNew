package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class embp extends emby {
    public static final /* synthetic */ int b = 0;
    private static final long serialVersionUID = -1522852442442473691L;
    protected final String a;
    private final String i;
    private final boolean j;

    static {
        int i = embn.a;
    }

    protected embp() {
        this(new embo());
    }

    protected emwz b() {
        emwz b2 = emxa.b(this);
        b2.c();
        b2.b("quotaProjectId", null);
        b2.b("universeDomain", this.i);
        b2.h("isExplicitUniverseDomain", false);
        return b2;
    }

    @Override // defpackage.emby
    public boolean equals(Object obj) {
        if (!(obj instanceof embp)) {
            return false;
        }
        embp embpVar = (embp) obj;
        String str = embpVar.a;
        if (Objects.equals(null, null) && Objects.equals(this.i, embpVar.i)) {
            boolean z = embpVar.j;
            if (Objects.equals(false, false)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.emby
    public int hashCode() {
        return Objects.hash(null, this.i, false);
    }

    @Override // defpackage.emby
    public final String toString() {
        return b().toString();
    }

    public embp(embo emboVar) {
        super(emboVar.a, emboVar.b, emboVar.c);
        this.a = null;
        this.i = "googleapis.com";
        this.j = false;
    }
}
