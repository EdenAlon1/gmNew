package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.contact.ContactListItemView;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddrk extends vk {
    private final List a = new ArrayList();
    private final ekyo d;
    private final ffbr e;
    private final ffbr f;

    public ddrk(ekyo ekyoVar, ffbr ffbrVar, ffbr ffbrVar2) {
        this.d = ekyoVar;
        this.e = ffbrVar;
        this.f = ffbrVar2;
    }

    @Override // defpackage.vk
    public final int a() {
        return this.a.size();
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ wr e(ViewGroup viewGroup, int i) {
        return new ddrj((ContactListItemView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.contact_item_view_row, viewGroup, false));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0201 A[Catch: all -> 0x0227, TryCatch #0 {all -> 0x0227, blocks: (B:3:0x000e, B:6:0x0078, B:8:0x00a2, B:10:0x00a8, B:12:0x00b2, B:13:0x0143, B:16:0x01ca, B:17:0x01fb, B:19:0x0201, B:20:0x020c, B:23:0x021b, B:28:0x0207, B:29:0x0153, B:31:0x0159, B:33:0x015d, B:36:0x0162, B:37:0x018f, B:38:0x00fc, B:39:0x0103, B:40:0x0104, B:41:0x0072), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0207 A[Catch: all -> 0x0227, TryCatch #0 {all -> 0x0227, blocks: (B:3:0x000e, B:6:0x0078, B:8:0x00a2, B:10:0x00a8, B:12:0x00b2, B:13:0x0143, B:16:0x01ca, B:17:0x01fb, B:19:0x0201, B:20:0x020c, B:23:0x021b, B:28:0x0207, B:29:0x0153, B:31:0x0159, B:33:0x015d, B:36:0x0162, B:37:0x018f, B:38:0x00fc, B:39:0x0103, B:40:0x0104, B:41:0x0072), top: B:2:0x000e }] */
    @Override // defpackage.vk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void g(defpackage.wr r20, int r21) {
        /*
            Method dump skipped, instructions count: 562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ddrk.g(wr, int):void");
    }

    public final void m(List list) {
        int size = this.a.size();
        int size2 = list.size();
        if (size == 0) {
            if (size2 == 0) {
                return;
            } else {
                size = 0;
            }
        }
        if (size2 == 0) {
            this.a.clear();
            x(0, size);
        } else if (size == 0) {
            this.a.addAll(list);
            w(0, this.a.size());
        } else {
            this.a.clear();
            this.a.addAll(list);
            p();
        }
    }
}
