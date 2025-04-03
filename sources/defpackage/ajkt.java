package defpackage;

import android.view.View;
import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajkt {
    public static final enru a = enru.c("com/google/android/apps/messaging/privacy/identitydetails/IdentityDetailsFragmentPeer");
    public static final List b;
    public final ea c;
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    public final ffbr g;
    public final ffbr h;
    public final ajkn i;
    public final ejxk j;

    static {
        engw C = engw.C(Integer.valueOf(R.id.key_part_1), Integer.valueOf(R.id.key_part_2), Integer.valueOf(R.id.key_part_3), Integer.valueOf(R.id.key_part_4), Integer.valueOf(R.id.key_part_5), Integer.valueOf(R.id.key_part_6), Integer.valueOf(R.id.key_part_7), Integer.valueOf(R.id.key_part_8), Integer.valueOf(R.id.key_part_9), Integer.valueOf(R.id.key_part_10), Integer.valueOf(R.id.key_part_11), Integer.valueOf(R.id.key_part_12), new Integer[0]);
        C.getClass();
        b = C;
    }

    public ajkt(ea eaVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ajkn ajknVar) {
        ffbrVar.getClass();
        ffbrVar4.getClass();
        this.c = eaVar;
        this.d = ffbrVar;
        this.e = ffbrVar2;
        this.f = ffbrVar3;
        this.g = ffbrVar4;
        this.h = ffbrVar5;
        this.i = ajknVar;
        this.j = new ajkq(this);
    }

    public final View a() {
        View findViewById = this.c.N().findViewById(R.id.grid_view);
        findViewById.getClass();
        return findViewById;
    }

    public final boolean b() {
        return (this.i.b & 4) != 0;
    }
}
