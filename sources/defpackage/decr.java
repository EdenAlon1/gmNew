package defpackage;

import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class decr implements erqj {
    final /* synthetic */ dgts a;

    public decr(dgts dgtsVar) {
        this.a = dgtsVar;
    }

    @Override // defpackage.erqj
    public final /* synthetic */ void b(Object obj) {
        ListIterator listIterator = (ListIterator) obj;
        if (!listIterator.hasNext()) {
            this.a.b(null, null);
            return;
        }
        cfyr cfyrVar = (cfyr) listIterator.next();
        fivn fivnVar = (fivn) fivp.a.createBuilder();
        fivnVar.a("timestamp", debm.a(cfyrVar.g));
        fivnVar.a("event_type", debm.a(cfyrVar.a.i));
        fivnVar.a("reply_mode", debm.a(cfyrVar.b.d));
        fivnVar.a("rejection_reason", debm.a(cfyrVar.d.a()));
        fivnVar.a("action_source", debm.a(cfyrVar.c.a()));
        fivnVar.a("num_of_items", debm.a(cfyrVar.e));
        fivnVar.a("click_index", debm.a(cfyrVar.f));
        fivnVar.a("impression_id", debm.c(cfyrVar.h));
        fivnVar.a("suggestion_types", debm.b(cfyrVar.i));
        fivnVar.a("num_of_labels", debm.a(((enou) cfyrVar.j).c));
        fivnVar.a("model_output_labels", debm.d(cfyrVar.j));
        fivi fiviVar = (fivi) fivj.a.createBuilder();
        fivp fivpVar = (fivp) fivnVar.build();
        fiviVar.copyOnWrite();
        fivj fivjVar = (fivj) fiviVar.instance;
        fivpVar.getClass();
        fivjVar.c = fivpVar;
        fivjVar.b |= 1;
        this.a.b(((fivj) fiviVar.build()).toByteArray(), null);
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        this.a.a(13, null);
    }
}
