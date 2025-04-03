package defpackage;

import androidx.window.extensions.embedding.ActivityStack;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pgz {
    private final List a;
    private final boolean b;
    private final ActivityStack.Token c;

    public pgz(List list, boolean z, ActivityStack.Token token) {
        this.a = list;
        this.b = z;
        this.c = token;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pgz)) {
            return false;
        }
        pgz pgzVar = (pgz) obj;
        return ffkj.e(this.a, pgzVar.a) && this.b == pgzVar.b && ffkj.e(this.c, pgzVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ActivityStack.Token token = this.c;
        return ((hashCode + (true != this.b ? 1237 : 1231)) * 31) + (token != null ? token.hashCode() : 0);
    }

    public final String toString() {
        return "ActivityStack{activitiesInProcess=" + this.a + ", isEmpty=" + this.b + ", token=" + this.c + '}';
    }
}
