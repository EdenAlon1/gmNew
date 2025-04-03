package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aidv {
    public final String a;
    public final List b;
    public final ffix c;
    public final aidu d;

    public aidv() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aidv)) {
            return false;
        }
        aidv aidvVar = (aidv) obj;
        return ffkj.e(this.a, aidvVar.a) && ffkj.e(this.b, aidvVar.b) && ffkj.e(this.c, aidvVar.c) && ffkj.e(this.d, aidvVar.d);
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "SuggestionListUiData(id=" + this.a + ", suggestionList=" + this.b + ", onSuggestionListInteractive=" + this.c + ", flags=" + this.d + ")";
    }

    public aidv(String str, List list, ffix ffixVar, aidu aiduVar) {
        this.a = str;
        this.b = list;
        this.c = ffixVar;
        this.d = aiduVar;
    }

    public /* synthetic */ aidv(byte[] bArr) {
        this("", ffel.a, new ffix() { // from class: aidt
            @Override // defpackage.ffix
            public final Object invoke() {
                return ffcu.a;
            }
        }, new aidu((byte[]) null));
    }
}
