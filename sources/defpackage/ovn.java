package defpackage;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.database.MatrixCursor;

/* loaded from: classes.dex */
public final class ovn {
    public static final Cursor a(otb otbVar, oxp oxpVar, boolean z) {
        oxpVar.getClass();
        otbVar.l();
        otbVar.m();
        Cursor a = otbVar.e().b().a(oxpVar);
        if (z && (a instanceof AbstractWindowedCursor)) {
            AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) a;
            int count = abstractWindowedCursor.getCount();
            if ((abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count) {
                try {
                    MatrixCursor matrixCursor = new MatrixCursor(a.getColumnNames(), a.getCount());
                    while (a.moveToNext()) {
                        Object[] objArr = new Object[a.getColumnCount()];
                        int columnCount = a.getColumnCount();
                        for (int i = 0; i < columnCount; i++) {
                            int type = a.getType(i);
                            if (type == 0) {
                                objArr[i] = null;
                            } else if (type == 1) {
                                objArr[i] = Long.valueOf(a.getLong(i));
                            } else if (type == 2) {
                                objArr[i] = Double.valueOf(a.getDouble(i));
                            } else if (type == 3) {
                                objArr[i] = a.getString(i);
                            } else {
                                if (type != 4) {
                                    throw new IllegalStateException();
                                }
                                objArr[i] = a.getBlob(i);
                            }
                        }
                        matrixCursor.addRow(objArr);
                    }
                    ffig.a(a, null);
                    return matrixCursor;
                } finally {
                }
            }
        }
        return a;
    }
}
