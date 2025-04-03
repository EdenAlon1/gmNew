package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aacb implements appj {
    public final List a;

    public aacb(List list) {
        this.a = list;
    }

    @Override // defpackage.appj
    public final String b() {
        return "message-list-gallery";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aacb) && ffkj.e(this.a, ((aacb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MessageListGalleryContent(gallery=" + this.a + ")";
    }
}
