package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.blockandreportspam.ui.dialog.BlockAndReportSpamCallbacks;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class taa {
    private static final enhk d;
    public final eg a;
    public final ffbr b;
    public final ffbr c;
    private final ffbr e;
    private final ffbr f;
    private final ffbr g;
    private final elbx h;

    static {
        enhd enhdVar = new enhd();
        taj tajVar = taj.BLOCK;
        Integer valueOf = Integer.valueOf(R.string.block_dialog_title_2024_05_10);
        enhdVar.k(tajVar, valueOf);
        enhdVar.k(taj.RBM_BLOCK, valueOf);
        taj tajVar2 = taj.SPAM;
        Integer valueOf2 = Integer.valueOf(R.string.spam_dialog_title_2024_05_10);
        enhdVar.k(tajVar2, valueOf2);
        enhdVar.k(taj.GROUP_SPAM, valueOf2);
        d = enhdVar.c();
    }

    public taa(eg egVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, elbx elbxVar, ffbr ffbrVar5) {
        this.a = egVar;
        this.b = ffbrVar;
        this.e = ffbrVar2;
        this.f = ffbrVar3;
        this.g = ffbrVar4;
        this.h = elbxVar;
        this.c = ffbrVar5;
    }

    public static IllegalArgumentException b(taj tajVar) {
        return new IllegalArgumentException(String.format("Unknown DialogType: %s", tajVar));
    }

    private static ParticipantsTable.BindData e(tak takVar) {
        return ((syd) ((syl) takVar).f).a;
    }

    final CharSequence a(tak takVar) {
        String P = e(takVar).P();
        if (TextUtils.isEmpty(P)) {
            P = this.a.getString(R.string.unknown_sender);
        }
        if (bdqv.d(e(takVar))) {
            return P;
        }
        return ((crnx) this.g.b()).b(cuxh.b(P.replace(' ', (char) 160)));
    }

    public final void c(Supplier supplier) {
        BlockAndReportSpamCallbacks blockAndReportSpamCallbacks = (BlockAndReportSpamCallbacks) this.b.b();
        blockAndReportSpamCallbacks.k = supplier;
        ((ejlq) blockAndReportSpamCallbacks.f.b()).k(blockAndReportSpamCallbacks.i);
        ((ejlq) blockAndReportSpamCallbacks.f.b()).k(blockAndReportSpamCallbacks.j);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(final defpackage.tak r21) {
        /*
            Method dump skipped, instructions count: 849
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.taa.d(tak):void");
    }
}
