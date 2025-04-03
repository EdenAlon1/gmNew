package defpackage;

import android.R;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fau implements InputConnection {
    public jvu a;
    public int b;
    public boolean c;
    private final boolean e;
    private final eva f;
    private final fhi g;
    private final jgi h;
    private int i;
    private final fap k;
    private final List j = new ArrayList();
    public boolean d = true;

    public fau(jvu jvuVar, fap fapVar, boolean z, eva evaVar, fhi fhiVar, jgi jgiVar) {
        this.k = fapVar;
        this.e = z;
        this.f = evaVar;
        this.g = fhiVar;
        this.h = jgiVar;
        this.a = jvuVar;
    }

    private final void c(int i) {
        sendKeyEvent(new KeyEvent(0, i));
        sendKeyEvent(new KeyEvent(1, i));
    }

    private final void d() {
        this.i++;
    }

    public final void a(juk jukVar) {
        d();
        try {
            this.j.add(jukVar);
        } finally {
            b();
        }
    }

    public final boolean b() {
        int i = this.i - 1;
        this.i = i;
        if (i == 0 && !this.j.isEmpty()) {
            this.k.a.b.invoke(ffdx.am(this.j));
            this.j.clear();
        }
        return this.i > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        if (!this.d) {
            return false;
        }
        d();
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.j.clear();
        this.i = 0;
        this.d = false;
        fap fapVar = this.k;
        int size = fapVar.a.i.size();
        for (int i = 0; i < size; i++) {
            if (ffkj.e(((WeakReference) fapVar.a.i.get(i)).get(), this)) {
                fapVar.a.i.remove(i);
                return;
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        if (this.d) {
            return this.e;
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        boolean z = this.d;
        if (z) {
            a(new juc(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        if (!this.d) {
            return false;
        }
        a(new jui(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        if (!this.d) {
            return false;
        }
        a(new juj(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return b();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        if (!this.d) {
            return false;
        }
        a(new juq());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        return TextUtils.getCapsMode(this.a.a(), jpm.d(this.a.c), i);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        int i2 = i & 1;
        this.c = 1 == i2;
        if (i2 != 0) {
            this.b = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return fav.a(this.a);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        if (jpm.i(this.a.c)) {
            return null;
        }
        return jvv.a(this.a).b;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i2) {
        return jvv.b(this.a, i).b;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i2) {
        return jvv.c(this.a, i).b;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        if (this.d) {
            switch (i) {
                case R.id.selectAll:
                    a(new jvr(0, this.a.a().length()));
                    break;
                case R.id.cut:
                    c(277);
                    break;
                case R.id.copy:
                    c(278);
                    break;
                case R.id.paste:
                    c(279);
                    break;
            }
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i) {
        int i2;
        if (!this.d) {
            return false;
        }
        if (i != 0) {
            switch (i) {
                case 2:
                    i2 = 2;
                    break;
                case 3:
                    i2 = 3;
                    break;
                case 4:
                    i2 = 4;
                    break;
                case 5:
                    i2 = 6;
                    break;
                case 6:
                    i2 = 7;
                    break;
                case 7:
                    i2 = 5;
                    break;
                default:
                    Log.w("RecordingIC", a.h(i, "IME sends unsupported Editor Action: "));
                    break;
            }
            this.k.a.c.invoke(new juu(i2));
            return true;
        }
        i2 = 1;
        this.k.a.c.invoke(new juu(i2));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // android.view.inputmethod.InputConnection
    public final void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, final IntConsumer intConsumer) {
        jlm jlmVar;
        PointF startPoint;
        PointF endPoint;
        long j;
        int i;
        int intValue;
        int i2;
        PointF insertionPoint;
        exq d;
        String textToInsert;
        jpg jpgVar;
        PointF joinOrSplitPoint;
        exq d2;
        jpg jpgVar2;
        int granularity;
        RectF deletionStartArea;
        RectF deletionEndArea;
        RectF selectionStartArea;
        RectF selectionEndArea;
        int granularity2;
        int granularity3;
        RectF deletionArea;
        RectF selectionArea;
        int granularity4;
        jpg jpgVar3;
        if (Build.VERSION.SDK_INT >= 34) {
            eva evaVar = this.f;
            fhi fhiVar = this.g;
            jgi jgiVar = this.h;
            fat fatVar = new fat(this);
            final int i3 = 3;
            if (evaVar != null && (jlmVar = evaVar.h) != null) {
                exq d3 = evaVar.d();
                if (ffkj.e(jlmVar, (d3 == null || (jpgVar3 = d3.a) == null) ? null : jpgVar3.a.a)) {
                    if (aak$$ExternalSyntheticApiModelOutline0.m23m((Object) handwritingGesture)) {
                        SelectGesture m17m = aak$$ExternalSyntheticApiModelOutline0.m17m((Object) handwritingGesture);
                        selectionArea = m17m.getSelectionArea();
                        iam e = icz.e(selectionArea);
                        granularity4 = m17m.getGranularity();
                        int e2 = fac.e(granularity4);
                        int i4 = jpd.b;
                        long c = fae.c(evaVar, e, e2, jpc.b);
                        if (jpm.i(c)) {
                            i3 = fac.a(m17m, fatVar);
                        } else {
                            fac.d(c, fhiVar, fatVar);
                            i3 = 1;
                        }
                    } else if (aak$$ExternalSyntheticApiModelOutline0.m$4(handwritingGesture)) {
                        DeleteGesture m12m = aak$$ExternalSyntheticApiModelOutline0.m12m((Object) handwritingGesture);
                        granularity3 = m12m.getGranularity();
                        int e3 = fac.e(granularity3);
                        deletionArea = m12m.getDeletionArea();
                        iam e4 = icz.e(deletionArea);
                        int i5 = jpd.b;
                        long c2 = fae.c(evaVar, e4, e3, jpc.b);
                        if (jpm.i(c2)) {
                            i3 = fac.a(m12m, fatVar);
                        } else {
                            fac.b(c2, jlmVar, joy.a(e3, 1), fatVar);
                            i3 = 1;
                        }
                    } else if (aak$$ExternalSyntheticApiModelOutline0.m$5(handwritingGesture)) {
                        SelectRangeGesture m18m = aak$$ExternalSyntheticApiModelOutline0.m18m((Object) handwritingGesture);
                        selectionStartArea = m18m.getSelectionStartArea();
                        iam e5 = icz.e(selectionStartArea);
                        selectionEndArea = m18m.getSelectionEndArea();
                        iam e6 = icz.e(selectionEndArea);
                        granularity2 = m18m.getGranularity();
                        int e7 = fac.e(granularity2);
                        int i6 = jpd.b;
                        long d4 = fae.d(evaVar, e5, e6, e7, jpc.b);
                        if (jpm.i(d4)) {
                            i3 = fac.a(m18m, fatVar);
                        } else {
                            fac.d(d4, fhiVar, fatVar);
                            i3 = 1;
                        }
                    } else if (aak$$ExternalSyntheticApiModelOutline0.m$3(handwritingGesture)) {
                        DeleteRangeGesture m13m = aak$$ExternalSyntheticApiModelOutline0.m13m((Object) handwritingGesture);
                        granularity = m13m.getGranularity();
                        int e8 = fac.e(granularity);
                        deletionStartArea = m13m.getDeletionStartArea();
                        iam e9 = icz.e(deletionStartArea);
                        deletionEndArea = m13m.getDeletionEndArea();
                        iam e10 = icz.e(deletionEndArea);
                        int i7 = jpd.b;
                        long d5 = fae.d(evaVar, e9, e10, e8, jpc.b);
                        if (jpm.i(d5)) {
                            i3 = fac.a(m13m, fatVar);
                        } else {
                            fac.b(d5, jlmVar, joy.a(e8, 1), fatVar);
                            i3 = 1;
                        }
                    } else if (aak$$ExternalSyntheticApiModelOutline0.m$6(handwritingGesture)) {
                        JoinOrSplitGesture m15m = aak$$ExternalSyntheticApiModelOutline0.m15m((Object) handwritingGesture);
                        if (jgiVar == null) {
                            i3 = fac.a(m15m, fatVar);
                        } else {
                            joinOrSplitPoint = m15m.getJoinOrSplitPoint();
                            int b = fae.b(evaVar, fae.e(joinOrSplitPoint), jgiVar);
                            if (b == -1 || !((d2 = evaVar.d()) == null || (jpgVar2 = d2.a) == null || !fae.f(jpgVar2, b))) {
                                i3 = fac.a(m15m, fatVar);
                            } else {
                                int i8 = b;
                                while (i8 > 0) {
                                    int codePointBefore = Character.codePointBefore(jlmVar, i8);
                                    if (!fae.h(codePointBefore)) {
                                        break;
                                    } else {
                                        i8 -= Character.charCount(codePointBefore);
                                    }
                                }
                                while (b < jlmVar.a()) {
                                    int codePointAt = Character.codePointAt(jlmVar, b);
                                    if (!fae.h(codePointAt)) {
                                        break;
                                    } else {
                                        b += Character.charCount(codePointAt);
                                    }
                                }
                                long a = jpn.a(i8, b);
                                if (jpm.i(a)) {
                                    fac.c(jpm.e(a), " ", fatVar);
                                } else {
                                    fac.b(a, jlmVar, false, fatVar);
                                }
                                i3 = 1;
                            }
                        }
                    } else if (aak$$ExternalSyntheticApiModelOutline0.m$1(handwritingGesture)) {
                        InsertGesture m14m = aak$$ExternalSyntheticApiModelOutline0.m14m((Object) handwritingGesture);
                        if (jgiVar == null) {
                            i3 = fac.a(m14m, fatVar);
                        } else {
                            insertionPoint = m14m.getInsertionPoint();
                            int b2 = fae.b(evaVar, fae.e(insertionPoint), jgiVar);
                            if (b2 == -1 || !((d = evaVar.d()) == null || (jpgVar = d.a) == null || !fae.f(jpgVar, b2))) {
                                i3 = fac.a(m14m, fatVar);
                            } else {
                                textToInsert = m14m.getTextToInsert();
                                fac.c(b2, textToInsert, fatVar);
                                i3 = 1;
                            }
                        }
                    } else if (aak$$ExternalSyntheticApiModelOutline0.m$2(handwritingGesture)) {
                        RemoveSpaceGesture m16m = aak$$ExternalSyntheticApiModelOutline0.m16m((Object) handwritingGesture);
                        exq d6 = evaVar.d();
                        jpg jpgVar4 = d6 != null ? d6.a : null;
                        startPoint = m16m.getStartPoint();
                        long e11 = fae.e(startPoint);
                        endPoint = m16m.getEndPoint();
                        long e12 = fae.e(endPoint);
                        ioc e13 = evaVar.e();
                        if (jpgVar4 == null || e13 == null) {
                            j = jpm.a;
                        } else {
                            long l = e13.l(e11);
                            long l2 = e13.l(e12);
                            int a2 = fae.a(jpgVar4.b, l, jgiVar);
                            int a3 = fae.a(jpgVar4.b, l2, jgiVar);
                            if (a2 == -1) {
                                if (a3 == -1) {
                                    j = jpm.a;
                                } else {
                                    a2 = a3;
                                }
                            } else if (a3 != -1) {
                                a2 = Math.min(a2, a3);
                            }
                            float e14 = jpgVar4.e(a2) + jpgVar4.b(a2);
                            int i9 = (int) (l2 >> 32);
                            int i10 = (int) (l >> 32);
                            float f = e14 / 2.0f;
                            iam iamVar = new iam(Math.min(Float.intBitsToFloat(i10), Float.intBitsToFloat(i9)), (-0.1f) + f, Math.max(Float.intBitsToFloat(i10), Float.intBitsToFloat(i9)), f + 0.1f);
                            jlz jlzVar = jpgVar4.b;
                            int i11 = jpd.b;
                            j = jlzVar.i(iamVar, 0, jpc.a);
                        }
                        if (jpm.i(j)) {
                            i3 = fac.a(m16m, fatVar);
                        } else {
                            ffkz ffkzVar = new ffkz();
                            ffkzVar.a = -1;
                            ffkz ffkzVar2 = new ffkz();
                            ffkzVar2.a = -1;
                            String str = jlmVar.subSequence(jpm.d(j), jpm.c(j)).b;
                            ffpa ffpaVar = new ffpa("\\s+");
                            fab fabVar = new fab(ffkzVar, ffkzVar2);
                            str.getClass();
                            ffos e15 = ffpaVar.e(str);
                            if (e15 == null) {
                                i = 1;
                            } else {
                                int length = str.length();
                                i = 1;
                                StringBuilder sb = new StringBuilder(length);
                                ffos ffosVar = e15;
                                int i12 = 0;
                                while (true) {
                                    sb.append((CharSequence) str, i12, ffosVar.b().d().intValue());
                                    ffos ffosVar2 = ffosVar;
                                    sb.append((CharSequence) fabVar.invoke(ffosVar2));
                                    intValue = ffosVar2.b().c().intValue() + 1;
                                    ffos c3 = ffosVar2.c();
                                    if (intValue >= length || c3 == null) {
                                        break;
                                    }
                                    ffosVar = c3;
                                    i12 = intValue;
                                }
                                if (intValue < length) {
                                    sb.append((CharSequence) str, intValue, length);
                                }
                                str = sb.toString();
                            }
                            int i13 = ffkzVar.a;
                            if (i13 == -1 || (i2 = ffkzVar2.a) == -1) {
                                i3 = fac.a(m16m, fatVar);
                            } else {
                                int e16 = jpm.e(j) + i13;
                                int e17 = jpm.e(j);
                                String substring = str.substring(i13, str.length() - (jpm.b(j) - ffkzVar2.a));
                                substring.getClass();
                                juk[] jukVarArr = new juk[2];
                                jukVarArr[0] = new jvr(e16, e17 + i2);
                                i3 = i;
                                jukVarArr[i3] = new juc(substring, i3);
                                fatVar.invoke(new fad(jukVarArr));
                            }
                        }
                    } else {
                        i3 = 2;
                    }
                }
            }
            if (intConsumer == null) {
                return;
            }
            if (executor != null) {
                executor.execute(new Runnable() { // from class: ezg
                    @Override // java.lang.Runnable
                    public final void run() {
                        IntConsumer.this.accept(i3);
                    }
                });
            } else {
                intConsumer.accept(i3);
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        return this.d;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        jlm jlmVar;
        RectF deletionStartArea;
        RectF deletionEndArea;
        int granularity;
        RectF selectionStartArea;
        RectF selectionEndArea;
        int granularity2;
        RectF deletionArea;
        int granularity3;
        RectF selectionArea;
        int granularity4;
        jpg jpgVar;
        if (Build.VERSION.SDK_INT >= 34) {
            eva evaVar = this.f;
            final fhi fhiVar = this.g;
            if (evaVar == null || (jlmVar = evaVar.h) == null) {
                return false;
            }
            exq d = evaVar.d();
            if (!ffkj.e(jlmVar, (d == null || (jpgVar = d.a) == null) ? null : jpgVar.a.a)) {
                return false;
            }
            if (aak$$ExternalSyntheticApiModelOutline0.m23m((Object) previewableHandwritingGesture)) {
                SelectGesture m17m = aak$$ExternalSyntheticApiModelOutline0.m17m((Object) previewableHandwritingGesture);
                if (fhiVar != null) {
                    selectionArea = m17m.getSelectionArea();
                    iam e = icz.e(selectionArea);
                    granularity4 = m17m.getGranularity();
                    int e2 = fac.e(granularity4);
                    int i = jpd.b;
                    fhiVar.q(fae.c(evaVar, e, e2, jpc.b));
                }
                fhiVar = null;
            } else if (aak$$ExternalSyntheticApiModelOutline0.m$4(previewableHandwritingGesture)) {
                DeleteGesture m12m = aak$$ExternalSyntheticApiModelOutline0.m12m((Object) previewableHandwritingGesture);
                if (fhiVar != null) {
                    deletionArea = m12m.getDeletionArea();
                    iam e3 = icz.e(deletionArea);
                    granularity3 = m12m.getGranularity();
                    int e4 = fac.e(granularity3);
                    int i2 = jpd.b;
                    fhiVar.n(fae.c(evaVar, e3, e4, jpc.b));
                }
                fhiVar = null;
            } else if (aak$$ExternalSyntheticApiModelOutline0.m$5(previewableHandwritingGesture)) {
                SelectRangeGesture m18m = aak$$ExternalSyntheticApiModelOutline0.m18m((Object) previewableHandwritingGesture);
                if (fhiVar != null) {
                    selectionStartArea = m18m.getSelectionStartArea();
                    iam e5 = icz.e(selectionStartArea);
                    selectionEndArea = m18m.getSelectionEndArea();
                    iam e6 = icz.e(selectionEndArea);
                    granularity2 = m18m.getGranularity();
                    int e7 = fac.e(granularity2);
                    int i3 = jpd.b;
                    fhiVar.q(fae.d(evaVar, e5, e6, e7, jpc.b));
                }
                fhiVar = null;
            } else if (aak$$ExternalSyntheticApiModelOutline0.m$3(previewableHandwritingGesture)) {
                DeleteRangeGesture m13m = aak$$ExternalSyntheticApiModelOutline0.m13m((Object) previewableHandwritingGesture);
                if (fhiVar != null) {
                    deletionStartArea = m13m.getDeletionStartArea();
                    iam e8 = icz.e(deletionStartArea);
                    deletionEndArea = m13m.getDeletionEndArea();
                    iam e9 = icz.e(deletionEndArea);
                    granularity = m13m.getGranularity();
                    int e10 = fac.e(granularity);
                    int i4 = jpd.b;
                    fhiVar.n(fae.d(evaVar, e8, e9, e10, jpc.b));
                }
                fhiVar = null;
            }
            if (cancellationSignal != null) {
                cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: faa
                    @Override // android.os.CancellationSignal.OnCancelListener
                    public final void onCancel() {
                        fhi fhiVar2 = fhi.this;
                        if (fhiVar2 != null) {
                            eva evaVar2 = fhiVar2.d;
                            if (evaVar2 != null) {
                                evaVar2.g(jpm.a);
                            }
                            eva evaVar3 = fhiVar2.d;
                            if (evaVar3 == null) {
                                return;
                            }
                            evaVar3.k(jpm.a);
                        }
                    }
                });
            }
            return true;
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0057 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.view.inputmethod.InputConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean requestCursorUpdates(int r10) {
        /*
            r9 = this;
            boolean r0 = r9.d
            r1 = 0
            if (r0 == 0) goto L71
            r0 = r10 & 1
            r2 = r10 & 2
            r3 = 1
            if (r2 == 0) goto Le
            r2 = r3
            goto Lf
        Le:
            r2 = r1
        Lf:
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 33
            if (r4 < r5) goto L4b
            r4 = r10 & 16
            if (r4 == 0) goto L1b
            r4 = r3
            goto L1c
        L1b:
            r4 = r1
        L1c:
            r5 = r10 & 8
            if (r5 == 0) goto L22
            r5 = r3
            goto L23
        L22:
            r5 = r1
        L23:
            r6 = r10 & 4
            if (r6 == 0) goto L29
            r6 = r3
            goto L2a
        L29:
            r6 = r1
        L2a:
            int r7 = android.os.Build.VERSION.SDK_INT
            r8 = 34
            if (r7 < r8) goto L35
            r10 = r10 & 32
            if (r10 == 0) goto L35
            r1 = r3
        L35:
            if (r4 != 0) goto L48
            if (r5 != 0) goto L48
            if (r6 != 0) goto L48
            if (r1 != 0) goto L48
            int r10 = android.os.Build.VERSION.SDK_INT
            if (r10 < r8) goto L44
            r10 = r3
            r1 = r10
            goto L46
        L44:
            r10 = r1
            r1 = r3
        L46:
            r4 = r1
            goto L4d
        L48:
            r10 = r1
            r1 = r6
            goto L4e
        L4b:
            r10 = r1
            r4 = r3
        L4d:
            r5 = r4
        L4e:
            fap r6 = r9.k
            fas r6 = r6.a
            fak r6 = r6.l
            java.lang.Object r7 = r6.a
            monitor-enter(r7)
            r6.d = r4     // Catch: java.lang.Throwable -> L6e
            r6.e = r5     // Catch: java.lang.Throwable -> L6e
            r6.f = r1     // Catch: java.lang.Throwable -> L6e
            r6.g = r10     // Catch: java.lang.Throwable -> L6e
            if (r0 == 0) goto L6a
            r6.c = r3     // Catch: java.lang.Throwable -> L6e
            jvu r10 = r6.h     // Catch: java.lang.Throwable -> L6e
            if (r10 == 0) goto L6a
            r6.a()     // Catch: java.lang.Throwable -> L6e
        L6a:
            r6.b = r2     // Catch: java.lang.Throwable -> L6e
            monitor-exit(r7)
            return r3
        L6e:
            r10 = move-exception
            monitor-exit(r7)
            throw r10
        L71:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fau.requestCursorUpdates(int):boolean");
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        if (!this.d) {
            return false;
        }
        ((BaseInputConnection) this.k.a.j.a()).sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        boolean z = this.d;
        if (z) {
            a(new jvp(i, i2));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        boolean z = this.d;
        if (z) {
            a(new jvq(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        if (!this.d) {
            return false;
        }
        a(new jvr(i, i2));
        return true;
    }
}
