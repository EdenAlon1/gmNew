package defpackage;

import android.os.IBinder;
import androidx.window.extensions.embedding.SplitInfo;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pli {
    private final pgz a;
    private final pgz b;
    private final plg c;
    private final IBinder d;
    private final SplitInfo.Token e;

    public pli(pgz pgzVar, pgz pgzVar2, plg plgVar, IBinder iBinder, SplitInfo.Token token) {
        this.a = pgzVar;
        this.b = pgzVar2;
        this.c = plgVar;
        this.d = iBinder;
        this.e = token;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pli)) {
            return false;
        }
        pli pliVar = (pli) obj;
        return ffkj.e(this.a, pliVar.a) && ffkj.e(this.b, pliVar.b) && ffkj.e(this.c, pliVar.c) && ffkj.e(this.e, pliVar.e) && ffkj.e(this.d, pliVar.d);
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        SplitInfo.Token token = this.e;
        int hashCode2 = ((hashCode * 31) + (token != null ? token.hashCode() : 0)) * 31;
        IBinder iBinder = this.d;
        return hashCode2 + (iBinder != null ? iBinder.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SplitInfo:{");
        sb.append("primaryActivityStack=" + this.a + ", ");
        sb.append("secondaryActivityStack=" + this.b + ", ");
        sb.append("splitAttributes=" + this.c + ", ");
        if (this.e != null) {
            SplitInfo.Token token = this.e;
            Objects.toString(token);
            sb.append("token=".concat(String.valueOf(token)));
        }
        if (this.d != null) {
            IBinder iBinder = this.d;
            Objects.toString(iBinder);
            sb.append("binder=".concat(String.valueOf(iBinder)));
        }
        sb.append("}");
        return sb.toString();
    }

    public pli(pgz pgzVar, pgz pgzVar2, plg plgVar) {
        this(pgzVar, pgzVar2, plgVar, null, null);
    }

    public pli(pgz pgzVar, pgz pgzVar2, plg plgVar, IBinder iBinder) {
        this(pgzVar, pgzVar2, plgVar, iBinder, null);
        pgk pgkVar = new pgk();
        ffmj ffmjVar = new ffmj(3, 4);
        int i = ffmjVar.a;
        int i2 = ffmjVar.b;
        int i3 = pgkVar.a;
        if (i > i3 || i3 > i2) {
            throw new UnsupportedOperationException("This API requires extension version " + ffmjVar + ", but the device is on " + pgkVar.a);
        }
    }
}
