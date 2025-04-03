package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class czmy implements ellf {

    /* compiled from: PG */
    public final class a extends czmy {
        public final String a;

        public a(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && ffkj.e(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "CancelGooglePhotosLinkShare(requestId=" + this.a + ")";
        }
    }
}
