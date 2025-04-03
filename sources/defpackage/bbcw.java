package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bbcw implements Comparator {
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        bbdc bbdcVar = (bbdc) obj;
        bbdc bbdcVar2 = (bbdc) obj2;
        bbcj bbcjVar = bbdcVar.d;
        if (bbcjVar.c() && !bbdcVar2.d.c()) {
            return -1;
        }
        if (bbcjVar.c() || !bbdcVar2.d.c()) {
            return Integer.compare(bbdcVar.h, bbdcVar2.h);
        }
        return 1;
    }
}
