package defpackage;

import com.google.research.xeno.effect.Callbacks$StatusCallback;
import com.google.research.xeno.effect.Effect;
import com.google.research.xeno.effect.FilterProcessorBase;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class fads {
    public final /* synthetic */ FilterProcessorBase a;
    public final /* synthetic */ Callbacks$StatusCallback b;
    public final /* synthetic */ Effect c;

    public /* synthetic */ fads(FilterProcessorBase filterProcessorBase, Callbacks$StatusCallback callbacks$StatusCallback, Effect effect) {
        this.a = filterProcessorBase;
        this.b = callbacks$StatusCallback;
        this.c = effect;
    }

    public final void a(long[] jArr) {
        long j = jArr[0];
        final Callbacks$StatusCallback callbacks$StatusCallback = this.b;
        if (j == 0) {
            callbacks$StatusCallback.onCompletion(false, "Processor has been released");
            return;
        }
        final Effect effect = this.c;
        final FilterProcessorBase filterProcessorBase = this.a;
        FilterProcessorBase.nativeSetEffect(j, jArr[1], new Callbacks$StatusCallback() { // from class: fadt
            @Override // com.google.research.xeno.effect.NativeCallbacks$StatusCallback
            public final void onCompletion(boolean z, String str) {
                FilterProcessorBase filterProcessorBase2 = FilterProcessorBase.this;
                if (z) {
                    filterProcessorBase2.a = effect;
                } else if (!str.equals("xeno::effect::EffectWasReconfiguredStatus()")) {
                    filterProcessorBase2.a = null;
                }
                callbacks$StatusCallback.onCompletion(z, str);
            }
        });
    }
}
