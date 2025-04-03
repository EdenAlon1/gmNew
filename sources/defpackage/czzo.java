package defpackage;

import android.database.Cursor;
import android.support.v7.widget.RecyclerView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.common.ListEmptyView;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czzo extends czzp implements bcrg, czzc {
    public final czzi a;
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    public final ffbr h;
    public RecyclerView i;
    public ListEmptyView j;
    public czzg k;
    public czzn l;
    public boolean m;
    public final bcpt g = new bcpt();
    public equr n = equr.UNKNOWN_INTENT_SOURCE;
    public final AtomicInteger o = new AtomicInteger(0);

    public czzo(czzi czziVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6) {
        this.a = czziVar;
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = ffbrVar3;
        this.h = ffbrVar4;
        this.e = ffbrVar5;
        this.f = ffbrVar6;
    }

    @Override // defpackage.bcrg
    public final void s(bcrh bcrhVar, Cursor cursor) {
        this.g.e(bcrhVar);
        czzg czzgVar = this.k;
        if (cursor != czzgVar.d) {
            if (cursor == null) {
                czzgVar.d = null;
            } else if (cursor instanceof bfkf) {
                czzgVar.d = (bfkf) cursor;
            } else {
                czzgVar.d = bfkq.a(cursor);
            }
            if (cursor != null) {
                cursor.getColumnIndex("_id");
                czzgVar.a = true;
                czzgVar.p();
            } else {
                czzgVar.a = false;
                czzgVar.p();
            }
        }
        if (cursor != null) {
            if (cursor.getCount() != 0) {
                this.j.setVisibility(8);
            } else {
                this.j.b(R.string.conversation_list_empty_text);
                this.j.setVisibility(0);
            }
        }
    }
}
