package defpackage;

import android.database.Cursor;
import defpackage.dtro;
import defpackage.dtry;
import defpackage.dtsu;
import defpackage.dtyq;
import defpackage.dtyx;
import j$.util.stream.Stream;
import java.io.Closeable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes4.dex */
public interface dtsu<C extends dtsu<C, Q, B, D, CR>, Q extends dtyq<C, Q, B, D, CR>, B extends dtyx<C, Q, B, D, CR>, D extends dtro<C, Q, B, D, CR>, CR extends dtry<CR>> extends Closeable {
    Cursor a();

    dtro cO();

    dtro cQ();

    dtro cS();

    dtro cT();

    dtsu cV(String str);

    engw cW();

    engw cX(dtsp dtspVar);

    engw cY(Supplier supplier);

    Stream cZ();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    String dd(String str);

    void dg(dtvs dtvsVar, engw engwVar, boolean z);

    void dh();

    boolean dj(String str);

    int getCount();

    int getPosition();

    boolean isAfterLast();

    boolean isBeforeFirst();

    boolean isClosed();

    boolean isFirst();

    boolean isLast();

    boolean moveToFirst();

    boolean moveToNext();

    boolean moveToPosition(int i);

    boolean moveToPrevious();
}
