import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.runner.RunWith;
import org.junit.experimental.theories.Theory;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.runners.Enclosed;
import org.junit.experimental.theories.Theories;
import org.junit.Test;
import org.junit.Before;
import trump.Card;
import trump.Master;
import trump.Table;
import trump.Player;
import trump.Rule;
import trump.Joker;

@RunWith(Enclosed.class)
public class NoblePlayerTest {
    public static class コンストラクタの動作確認 {
        private Master _master;
        private NobleTable _table;
        private NobleRule _Rule;

        @Before
        private void setUp() throws Exception {
            _master = new Master();
            _table = new NobleTable();
            _rule = new NobleRule();
        }

        @Test
        public void コンストラクタ() throws Exception {
            NoblePlayer instance = new NoblePlayer("太郎", _master, _table, _rule);
        }
    }
}
