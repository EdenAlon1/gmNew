package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bcyd extends bcyw implements cbbt {
    private final Context a;
    private final Uri b;
    private final bcyc d;
    private final cbbu e;
    private String f;
    private final bcpt g;
    private cbaf h;
    private final Uri i;
    private final cbac j;

    public bcyd(Context context, bcyc bcycVar, crji crjiVar, cbbu cbbuVar, cbac cbacVar, Uri uri) {
        this.g = new bcpt();
        this.a = context;
        this.f = context.getString(R.string.loading_vcard);
        this.b = uri;
        this.d = bcycVar;
        this.e = cbbuVar;
        this.j = cbacVar;
        this.i = crjiVar.a();
    }

    @Override // defpackage.bcyw
    public final long a() {
        return -1L;
    }

    @Override // defpackage.bcyw
    public final long b() {
        return -1L;
    }

    @Override // defpackage.bcyw
    public final Intent c() {
        return null;
    }

    @Override // defpackage.bcyw
    public final Uri d() {
        if (!q()) {
            return this.i;
        }
        List list = this.h.a;
        csix.k(!list.isEmpty());
        bcyc bcycVar = this.d;
        csix.l(list);
        csix.k(!list.isEmpty());
        if (list.size() == 1) {
            return bcycVar.a((cbaj) list.get(0));
        }
        int min = Math.min(list.size(), 4);
        ArrayList arrayList = new ArrayList(min);
        for (int i = 0; i < min; i++) {
            arrayList.add(bcycVar.a((cbaj) list.get(i)));
        }
        return crjm.o(bcycVar.a, arrayList);
    }

    @Override // defpackage.bcyw
    public final Optional e() {
        return Optional.empty();
    }

    @Override // defpackage.cbbt
    public final void fW(cbbn cbbnVar) {
        bcyv bcyvVar;
        this.g.d();
        this.f = this.a.getString(R.string.failed_loading_vcard);
        if (!i() || (bcyvVar = this.c) == null) {
            return;
        }
        bcyvVar.a(this);
    }

    @Override // defpackage.cbbt
    public final /* bridge */ /* synthetic */ void fX(cbbn cbbnVar, cbcc cbccVar, boolean z) {
        bcyv bcyvVar;
        cbaf cbafVar = (cbaf) cbccVar;
        emxf.a(this.h == null);
        this.g.d();
        this.f = this.a.getResources().getQuantityString(R.plurals.vcard_tap_hint_new, cbafVar.a.size());
        this.h = cbafVar;
        cbafVar.p();
        if (!i() || (bcyvVar = this.c) == null) {
            return;
        }
        bcyvVar.b(this);
    }

    @Override // defpackage.bcpr
    public final void g(String str) {
        super.g(str);
        if (this.b != null) {
            this.g.f();
            cbaf cbafVar = this.h;
            if (cbafVar != null) {
                cbafVar.q();
                this.h = null;
            }
        }
    }

    @Override // defpackage.bcpr
    public final void ga(String str) {
        super.ga(str);
        Uri uri = this.b;
        if (uri != null) {
            cbac cbacVar = this.j;
            bcpt bcptVar = this.g;
            Context context = this.a;
            cbad cbadVar = (cbad) cbacVar.a.b();
            cbadVar.getClass();
            bcptVar.c(new cbab(cbadVar, uri).e(context, this));
            this.e.d((cbbn) this.g.a());
        }
    }

    @Override // defpackage.bcyw
    public final Optional k() {
        return Optional.empty();
    }

    @Override // defpackage.bcyw
    public final String l() {
        return this.f;
    }

    @Override // defpackage.bcyw
    public final String m() {
        if (!q()) {
            return null;
        }
        List list = this.h.a;
        csix.k(!list.isEmpty());
        return list.size() == 1 ? ((cbaj) list.get(0)).d : this.a.getResources().getQuantityString(R.plurals.vcard_multiple_display_name, list.size(), Integer.valueOf(list.size()));
    }

    @Override // defpackage.bcyw
    public final String n() {
        return null;
    }

    public final Uri o() {
        if (q()) {
            return this.b;
        }
        return null;
    }

    public final List p() {
        if (q()) {
            return this.h.a;
        }
        int i = engw.d;
        return enou.a;
    }

    public final boolean q() {
        return i() && this.h != null;
    }

    public bcyd(Context context, bcyc bcycVar, crji crjiVar, cbbu cbbuVar, cbac cbacVar, MessagePartCoreData messagePartCoreData) {
        this(context, bcycVar, crjiVar, cbbuVar, cbacVar, messagePartCoreData.t());
        csix.k(messagePartCoreData.bC());
    }
}
