package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esgb {
    public final enip a;

    public esgb(enip enipVar) {
        enin i = enip.i(enipVar.size());
        enqu listIterator = enipVar.listIterator();
        while (listIterator.hasNext()) {
            i.c(emuz.d((String) listIterator.next()));
        }
        this.a = i.g();
    }
}
