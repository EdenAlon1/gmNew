package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aigf {
    public final dotb a;
    public final aidv b;
    public final List c;
    public final aige d;
    private final boolean e;

    public /* synthetic */ aigf(dotb dotbVar, aidv aidvVar, List list, aige aigeVar) {
        dotbVar.getClass();
        aidvVar.getClass();
        list.getClass();
        this.a = dotbVar;
        this.e = true;
        this.b = aidvVar;
        this.c = list;
        this.d = aigeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aigf)) {
            return false;
        }
        aigf aigfVar = (aigf) obj;
        if (!ffkj.e(this.a, aigfVar.a)) {
            return false;
        }
        boolean z = aigfVar.e;
        return ffkj.e(this.b, aigfVar.b) && ffkj.e(this.c, aigfVar.c) && ffkj.e(this.d, aigfVar.d);
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + 1231) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + 1237;
    }

    public final String toString() {
        return "AutoCompleteTopAppBarUiData(topAppBarUiData=" + this.a + ", focusTextField=true, suggestionListUiData=" + this.b + ", selectedRecipients=" + this.c + ", flags=" + this.d + ")";
    }
}
