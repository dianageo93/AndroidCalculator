package com.example.mycalculator;

import net.sourceforge.jeval.*;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity {

	private String txtAfisat="";
	private String rezultat="0";
	private TextView txtIntrodus;
	private TextView txtRezultat;
	
	private void updateTextFields() {

		txtIntrodus.setText(txtAfisat);
		txtRezultat.setText(rezultat);
	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		txtIntrodus = (TextView)findViewById(R.id.txtIntrodus);
		txtRezultat = (TextView)findViewById(R.id.txtRezultat);
		
		updateTextFields();
		
		final Button btn1 = (Button)findViewById(R.id.unu);
		btn1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				txtAfisat += "1";
				updateTextFields();
			}
		});
		
		final Button btn2 = (Button)findViewById(R.id.doi);
		btn2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				txtAfisat += "2";
				updateTextFields();
			}
		});
		
		final Button btn3 = (Button)findViewById(R.id.trei);
		btn3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				txtAfisat += "3";
				updateTextFields();
			}
		});
		
		final Button btn4 = (Button)findViewById(R.id.patru);
		btn4.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				txtAfisat += "4";
				updateTextFields();
			}
		});
		
		final Button btn5 = (Button)findViewById(R.id.cinci);
		btn5.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				txtAfisat += "5";
				updateTextFields();
			}
		});
		
		final Button btn6 = (Button)findViewById(R.id.sase);
		btn6.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				txtAfisat += "6";
				updateTextFields();
			}
		});
		
		final Button btn7 = (Button)findViewById(R.id.sapte);
		btn7.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				txtAfisat += "7";
				updateTextFields();
			}
		});
		
		final Button btn8 = (Button)findViewById(R.id.opt);
		btn8.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				txtAfisat += "8";
				updateTextFields();
			}
		});
		
		final Button btn9 = (Button)findViewById(R.id.noua);
		btn9.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				txtAfisat += "9";
				updateTextFields();
			}
		});
		
		final Button btn0 = (Button)findViewById(R.id.zero);
		btn0.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				txtAfisat += "0";
				updateTextFields();
			}
		});
		
		final Button btnSterge = (Button)findViewById(R.id.C);
		btnSterge.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				txtAfisat = "";
				updateTextFields();
			}
		});
		
		final Button btnPlus = (Button) findViewById(R.id.plus);
        btnPlus.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                	txtAfisat += "+";
                	updateTextFields();
                }

        });
        
        final Button btnMinus = (Button) findViewById(R.id.minus);
        btnMinus.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                        txtAfisat += "-";
                        updateTextFields();
                }

        });
        
        final Button btnImp = (Button) findViewById(R.id.supra);
        btnImp.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                        txtAfisat += "/";
                        updateTextFields();
                }

        });
        
        final Button btnOri = (Button) findViewById(R.id.ori);
        btnOri.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                        txtAfisat += "*";
                        updateTextFields();
                }

        });
        
        final Button btnPunct = (Button)findViewById(R.id.punct);
        btnPunct.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                    txtAfisat += ".";
                    updateTextFields();
            }

    });
        
        final Button btnTan = (Button)findViewById(R.id.tan);
        btnTan.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                    txtAfisat += "tan(";
                    updateTextFields();
            }

    });
        final Button btnSin = (Button)findViewById(R.id.sin);
        btnSin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                    txtAfisat += "sin";
                    updateTextFields();
            }

    });
        
        final Button btnCos = (Button)findViewById(R.id.cos);
        btnCos.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                    txtAfisat += "cos(";
                    updateTextFields();
            }

    });
        
//        final Button btnCotan = (Button)findViewById(R.id.cotan);
//        btnCotan.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                    txtAfisat += "co(";
//                    updateTextFields();
//            }
//
//    });
        
        final Context context = this;
        
        final Button btnEgal = (Button) findViewById(R.id.egal);
        btnEgal.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				Evaluator evaluator = new Evaluator();
				try {
					rezultat = evaluator.evaluate(txtAfisat);
				} catch (EvaluationException e) {
					Toast.makeText(context, "Nu merge :( ", Toast.LENGTH_SHORT).show();
				}
				txtAfisat = "";
				updateTextFields();
			}
        });
		
	}
	    
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
