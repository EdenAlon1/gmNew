package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmmk {
    public final List a;
    public final ffji b;
    public final ffji c;
    public final ffji d;

    public dmmk(List list, ffji ffjiVar, ffji ffjiVar2, ffji ffjiVar3) {
        this.a = list;
        this.b = ffjiVar;
        this.c = ffjiVar2;
        this.d = ffjiVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmmk)) {
            return false;
        }
        dmmk dmmkVar = (dmmk) obj;
        return ffkj.e(this.a, dmmkVar.a) && ffkj.e(this.b, dmmkVar.b) && ffkj.e(this.c, dmmkVar.c) && ffkj.e(this.d, dmmkVar.d);
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "ComposeRowDraftAttachmentUiData(attachments=" + this.a + ", onClick=" + this.b + ", onRemove=" + this.c + ", onMagicEdit=" + this.d + ")";
    }

    public /* synthetic */ dmmk(List list, ffji ffjiVar, ffji ffjiVar2) {
        this(list, ffjiVar, ffjiVar2, new ffji() { // from class: dmmj
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                ((Integer) obj).intValue();
                return ffcu.a;
            }
        });
    }
}
