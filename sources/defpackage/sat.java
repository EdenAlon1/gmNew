package defpackage;

import com.google.android.apps.aicore.aidl.IAICoreService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sat extends saj {
    private final IAICoreService a;
    private final sco b;

    public sat(IAICoreService iAICoreService, sco scoVar) {
        if (iAICoreService == null) {
            throw new NullPointerException("Null service");
        }
        this.a = iAICoreService;
        if (scoVar == null) {
            throw new NullPointerException("Null disconnectSignal");
        }
        this.b = scoVar;
    }

    @Override // defpackage.saj
    public final IAICoreService a() {
        return this.a;
    }

    @Override // defpackage.saj
    public final sco b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof saj) {
            saj sajVar = (saj) obj;
            if (this.a.equals(sajVar.a()) && this.b.equals(sajVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        sco scoVar = this.b;
        return "ServiceContext{service=" + this.a.toString() + ", disconnectSignal=" + scoVar.toString() + "}";
    }
}
